package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.util.C2979b2;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class or0 extends WebChromeClient {

    /* renamed from: a */
    private final pr0 f21128a;

    public or0(pr0 pr0) {
        this.f21128a = pr0;
    }

    /* renamed from: b */
    private static final Context m28662b(WebView webView) {
        if (!(webView instanceof pr0)) {
            return webView.getContext();
        }
        pr0 pr0 = (pr0) webView;
        Activity i = pr0.mo17241i();
        if (i != null) {
            return i;
        }
        return pr0.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20091a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        C2926b f;
        try {
            pr0 pr0 = this.f21128a;
            if (pr0 == null || pr0.mo17673Q0() == null || this.f21128a.mo17673Q0().mo17301f() == null || (f = this.f21128a.mo17673Q0().mo17301f()) == null || f.mo10829c()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new mr0(jsPromptResult, editText)).setNegativeButton(17039360, new lr0(jsPromptResult)).setOnCancelListener(new kr0(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new jr0(jsResult)).setNegativeButton(17039360, new ir0(jsResult)).setOnCancelListener(new hr0(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            f.mo10828b(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            ul0.m31863h("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof pr0)) {
            ul0.m31862g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        C2955n M = ((pr0) webView).mo17667M();
        if (M == null) {
            ul0.m31862g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            M.mo10874a();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = nr0.f20708a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            ul0.m31859d(sb2);
        } else if (i == 2) {
            ul0.m31862g(sb2);
        } else if (i == 3 || i == 4) {
            ul0.m31861f(sb2);
        } else if (i != 5) {
            ul0.m31861f(sb2);
        } else {
            ul0.m31857b(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f21128a.mo17707s() != null) {
            webView2.setWebViewClient(this.f21128a.mo17707s());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C2971s.m13214q();
            if (!C2979b2.m13255f(this.f21128a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                C2971s.m13214q();
                if (!C2979b2.m13255f(this.f21128a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C2955n M = this.f21128a.mo17667M();
        if (M == null) {
            ul0.m31862g("Could not get ad overlay when hiding custom view.");
        } else {
            M.mo10877c();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo20091a(m28662b(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo20091a(m28662b(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo20091a(m28662b(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo20091a(m28662b(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C2955n M = this.f21128a.mo17667M();
        if (M == null) {
            ul0.m31862g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        M.mo10880f7(view, customViewCallback);
        M.mo10888l7(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
