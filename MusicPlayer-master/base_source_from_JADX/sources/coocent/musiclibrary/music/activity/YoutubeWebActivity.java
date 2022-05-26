package coocent.musiclibrary.music.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8353g;

public class YoutubeWebActivity extends AppCompatActivity {

    /* renamed from: A */
    private ImageView f32316A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ProgressBar f32317B;

    /* renamed from: C */
    private String f32318C;

    /* renamed from: z */
    private WebView f32319z;

    /* renamed from: coocent.musiclibrary.music.activity.YoutubeWebActivity$a */
    class C7318a extends WebViewClient {
        C7318a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (YoutubeWebActivity.this.f32317B != null) {
                YoutubeWebActivity.this.f32317B.setVisibility(4);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (YoutubeWebActivity.this.f32317B != null) {
                YoutubeWebActivity.this.f32317B.setVisibility(0);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* renamed from: coocent.musiclibrary.music.activity.YoutubeWebActivity$b */
    class C7319b extends WebChromeClient {
        C7319b(YoutubeWebActivity youtubeWebActivity) {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: coocent.musiclibrary.music.activity.YoutubeWebActivity$c */
    class C7320c implements View.OnClickListener {
        C7320c() {
        }

        public void onClick(View view) {
            if (view.getId() == C8350d.iv_back) {
                boolean unused = YoutubeWebActivity.this.m41472j2();
            }
        }
    }

    /* renamed from: coocent.musiclibrary.music.activity.YoutubeWebActivity$d */
    class C7321d implements View.OnKeyListener {
        C7321d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return keyEvent.getAction() == 0 && i == 4 && YoutubeWebActivity.this.m41472j2();
        }
    }

    /* renamed from: h2 */
    private void m41470h2() {
        Toast.makeText(this, C8353g.error, 0);
        finish();
    }

    /* renamed from: i2 */
    private void m41471i2() {
        Intent intent = getIntent();
        if (intent.hasExtra("query")) {
            String stringExtra = intent.getStringExtra("query");
            this.f32318C = stringExtra;
            if (stringExtra == null) {
                m41470h2();
                return;
            }
            return;
        }
        m41470h2();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public boolean m41472j2() {
        if (this.f32319z.canGoBack()) {
            this.f32319z.goBack();
            return true;
        }
        finish();
        return false;
    }

    /* renamed from: k2 */
    private void m41473k2() {
        WebView webView = this.f32319z;
        webView.loadUrl("https://www.youtube.com/results?search_query=" + this.f32318C);
        this.f32319z.setWebViewClient(new C7318a());
    }

    /* renamed from: l2 */
    private void m41474l2() {
        this.f32319z = (WebView) findViewById(C8350d.web);
        this.f32316A = (ImageView) findViewById(C8350d.iv_back);
        this.f32317B = (ProgressBar) findViewById(C8350d.progressbar);
    }

    /* renamed from: m2 */
    private void m41475m2() {
        mo28052o2();
    }

    /* renamed from: n2 */
    private void m41476n2() {
        this.f32316A.setOnClickListener(new C7320c());
        this.f32319z.setOnKeyListener(new C7321d());
    }

    /* renamed from: g2 */
    public void mo28051g2() {
        this.f32319z.stopLoading();
        ((ViewGroup) this.f32319z.getParent()).removeView(this.f32319z);
        this.f32319z.removeAllViews();
        this.f32319z.clearCache(true);
        this.f32319z.clearHistory();
        this.f32319z.destroy();
        this.f32319z = null;
    }

    /* renamed from: o2 */
    public void mo28052o2() {
        WebSettings settings = this.f32319z.getSettings();
        this.f32319z.setInitialScale(100);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        this.f32319z.setWebChromeClient(new C7319b(this));
        settings.setCacheMode(-1);
        this.f32319z.getSettings().setBlockNetworkImage(false);
    }

    public void onBackPressed() {
        m41472j2();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8351e.youtubeweb);
        m41471i2();
        m41474l2();
        m41473k2();
        m41475m2();
        m41476n2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo28051g2();
    }

    public void onPause() {
        super.onPause();
        this.f32319z.onPause();
        this.f32319z.pauseTimers();
    }

    public void onResume() {
        super.onResume();
        this.f32319z.resumeTimers();
        this.f32319z.onResume();
    }
}
