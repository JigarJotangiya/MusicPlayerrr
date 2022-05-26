package net.coocent.android.xmlparser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0506a;
import net.coocent.android.xmlparser.p461z.C9566f;
import p391j.p392a.p393a.C8611d;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class PrivacyActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: z */
    WebView f36130z;

    /* renamed from: net.coocent.android.xmlparser.PrivacyActivity$a */
    class C9356a extends WebViewClient {
        C9356a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            PrivacyActivity.this.f36130z.loadUrl("file:///android_asset/privacy.txt");
        }
    }

    /* renamed from: d2 */
    public static void m49504d2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, PrivacyActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("privacy_url", str);
        }
        intent.putExtra("light_status_bar", z);
        context.startActivity(intent);
    }

    /* renamed from: e2 */
    public static void m49505e2(Activity activity, String str, boolean z) {
        Intent intent = new Intent(activity, PrivacyActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("privacy_url", str);
        }
        intent.putExtra("light_status_bar", z);
        intent.putExtra("show_options", true);
        activity.startActivityForResult(intent, 272);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21 || i > 25) {
            super.applyOverrideConfiguration(configuration);
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        if (view.getId() == C8614g.btn_deny) {
            intent.putExtra("accept", false);
            setResult(0, intent);
            finish();
        } else if (view.getId() == C8614g.btn_accept) {
            intent.putExtra("accept", true);
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        setContentView(C8615h.activity_privacy);
        Intent intent = getIntent();
        String str = BuildConfig.FLAVOR;
        int i = 0;
        if (intent != null) {
            z2 = intent.getBooleanExtra("show_options", false);
            z = intent.getBooleanExtra("light_status_bar", false);
            String stringExtra = intent.getStringExtra("privacy_url");
            if (stringExtra != null) {
                str = stringExtra;
            }
        } else {
            z2 = false;
            z = false;
        }
        Window window = getWindow();
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(1024);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            if (i2 >= 23) {
                if (z) {
                    decorView.setSystemUiVisibility(decorView.getVisibility() | 8192);
                }
                window.setStatusBarColor(C0506a.m3150b(this, C8611d.privacy_primary_color));
            } else {
                window.setStatusBarColor(Color.argb(33, 0, 0, 0));
            }
        } else if (i2 >= 19) {
            window.addFlags(201326592);
        }
        this.f36130z = (WebView) findViewById(C8614g.wv_privacy);
        Toolbar toolbar = (Toolbar) findViewById(C8614g.toolbar);
        LinearLayout linearLayout = (LinearLayout) findViewById(C8614g.layout_options);
        if (!z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        mo478Y1(toolbar);
        if (mo471R1() != null) {
            mo471R1().mo425x(C8616i.coocent_setting_privacypolicy_title);
            mo471R1().mo420s(true);
            mo471R1().mo423v(true);
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = C9566f.m50196g(getApplication());
            }
            this.f36130z.getSettings().setDefaultTextEncodingName("UTF-8");
            this.f36130z.loadUrl(str);
            this.f36130z.setWebViewClient(new C9356a());
        } catch (Exception e) {
            e.printStackTrace();
            this.f36130z.loadUrl("file:///android_asset/privacy.txt");
        }
        findViewById(C8614g.btn_deny).setOnClickListener(this);
        findViewById(C8614g.btn_accept).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f36130z;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
