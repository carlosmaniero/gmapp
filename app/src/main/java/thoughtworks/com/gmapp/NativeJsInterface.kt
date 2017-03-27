package thoughtworks.com.gmapp

import android.content.Context
import android.widget.Toast
import android.webkit.JavascriptInterface


class NativeJsInterface
internal constructor(internal var mContext: Context) {
    @JavascriptInterface
    fun alert(toast: String) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
    }
}