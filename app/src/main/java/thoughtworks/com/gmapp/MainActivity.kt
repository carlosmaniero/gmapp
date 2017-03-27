package thoughtworks.com.gmapp

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webview = findViewById(R.id.webview) as WebView
        webview.setWebViewClient(WebViewClient())
        webview.addJavascriptInterface(NativeJsInterface(this), "native")
        val websettings = webview.settings
        websettings.javaScriptEnabled = true
        webview.loadUrl("file:///android_asset/home.html")
    }
}
