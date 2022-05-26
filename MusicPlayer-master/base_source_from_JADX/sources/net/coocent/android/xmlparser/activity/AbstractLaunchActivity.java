package net.coocent.android.xmlparser.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0506a;
import androidx.core.widget.C0549e;
import com.google.android.gms.ads.C3097n;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.PrivacyActivity;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.ads.AppOpenAdManager;
import net.coocent.android.xmlparser.application.AbstractApplication;
import p391j.p392a.p393a.C8611d;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8616i;

public abstract class AbstractLaunchActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: A */
    protected AppCompatCheckBox f36138A;

    /* renamed from: B */
    protected Button f36139B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public CountDownTimer f36140C;

    /* renamed from: D */
    private boolean f36141D = false;

    /* renamed from: E */
    protected long f36142E = 3500;

    /* renamed from: F */
    protected long f36143F = 1000;

    /* renamed from: G */
    protected int f36144G = 4;

    /* renamed from: H */
    protected boolean f36145H = false;

    /* renamed from: z */
    protected LinearLayout f36146z;

    /* renamed from: net.coocent.android.xmlparser.activity.AbstractLaunchActivity$a */
    class C9358a extends CountDownTimer {

        /* renamed from: a */
        boolean f36147a = false;

        C9358a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            if (!this.f36147a) {
                if (AbstractLaunchActivity.this.m49511q2()) {
                    AbstractLaunchActivity.this.m49514u2();
                    return;
                }
                AbstractLaunchActivity.this.mo32427p2();
                AbstractLaunchActivity.this.finish();
            }
        }

        public void onTick(long j) {
            if (!this.f36147a && AbstractLaunchActivity.this.m49511q2()) {
                AbstractLaunchActivity abstractLaunchActivity = AbstractLaunchActivity.this;
                if (j <= abstractLaunchActivity.f36142E - abstractLaunchActivity.f36143F) {
                    abstractLaunchActivity.f36140C.cancel();
                    this.f36147a = true;
                    AbstractLaunchActivity.this.m49514u2();
                }
            }
        }
    }

    /* renamed from: j2 */
    private void m49509j2() {
        if (mo32421i2() && !AdHelper.m49536p().mo32455q()) {
            AdHelper.m49536p().mo32449j(this, this.f36144G);
        }
    }

    /* renamed from: m2 */
    private void m49510m2() {
        if (getApplication() instanceof AbstractApplication) {
            AbstractApplication abstractApplication = (AbstractApplication) getApplication();
            abstractApplication.mo32494d(getApplication());
            if (abstractApplication.mo32493c() != null) {
                AppOpenAdManager c = abstractApplication.mo32493c();
                if (!c.mo32468s() && !c.mo32467r()) {
                    abstractApplication.mo32493c().mo32470u();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public boolean m49511q2() {
        if (mo26638h2() == 1) {
            return m49512r2();
        }
        if (mo26638h2() == 2 && (getApplication() instanceof AbstractApplication)) {
            AbstractApplication abstractApplication = (AbstractApplication) getApplication();
            abstractApplication.mo32494d(getApplication());
            if (abstractApplication.mo32493c() != null) {
                return abstractApplication.mo32493c().mo32467r();
            }
        }
        return false;
    }

    /* renamed from: r2 */
    private boolean m49512r2() {
        if (mo26638h2() == 1 && mo32421i2()) {
            return AdHelper.m49536p().mo32455q();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo32428t2() {
        mo32427p2();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m49514u2() {
        if (mo26638h2() == 1) {
            mo32427p2();
            finish();
            if (mo32421i2()) {
                AdHelper.m49536p().mo32458u(this);
            }
        } else if (mo26638h2() != 2) {
            mo32427p2();
            finish();
        } else if (getApplication() instanceof AbstractApplication) {
            AbstractApplication abstractApplication = (AbstractApplication) getApplication();
            if (abstractApplication.mo32493c() != null) {
                AppOpenAdManager c = abstractApplication.mo32493c();
                c.mo32471v();
                c.mo32475z(this, new C9363a(this));
                c.mo32466q();
            }
        }
    }

    /* renamed from: v2 */
    private void m49515v2(long j) {
        C9358a aVar = new C9358a(j, 200);
        this.f36140C = aVar;
        aVar.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public int mo26638h2() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public boolean mo32421i2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k2 */
    public abstract Class<? extends Activity> mo26639k2();

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public int mo32422l2() {
        return C8615h.activity_launcher;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo26640n2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo32423o2() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C8614g.container);
        this.f36146z = (LinearLayout) findViewById(C8614g.ll_privacy);
        this.f36138A = (AppCompatCheckBox) findViewById(C8614g.cb_privacy);
        TextView textView = (TextView) findViewById(C8614g.tv_privacy_policy);
        this.f36139B = (Button) findViewById(C8614g.btn_start);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(C8616i.coocent_setting_privacypolicy_title);
        spannableStringBuilder.append(string);
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, string.length(), 33);
        textView.setText(spannableStringBuilder);
        this.f36139B.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.f36138A.setOnCheckedChangeListener(this);
        C0549e.m3395c(this.f36138A, new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C0506a.m3150b(this, C8611d.splashCheckBoxUnCheckColor), C0506a.m3150b(this, C8611d.splashCheckBoxCheckColor)}));
        this.f36139B.setEnabled(this.f36138A.isChecked());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 272 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("accept", false);
            AppCompatCheckBox appCompatCheckBox = this.f36138A;
            if (appCompatCheckBox != null) {
                appCompatCheckBox.setChecked(booleanExtra);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (compoundButton.getId() == C8614g.cb_privacy) {
            this.f36139B.setEnabled(z);
            Button button = this.f36139B;
            if (z) {
                i = C0506a.m3150b(this, C8611d.splashButtonTextColor);
            } else {
                i = C0506a.m3150b(this, C8611d.splashButtonDisableTextColor);
            }
            button.setTextColor(i);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C8614g.btn_start) {
            boolean z = false;
            view.setClickable(false);
            C9502v.m49922Q(this, false);
            if (m49511q2()) {
                m49514u2();
                return;
            }
            C3097n.m13616a(getApplicationContext());
            if (getApplication() instanceof AbstractApplication) {
                z = ((AbstractApplication) getApplication()).mo26943e();
            }
            C3097n.m13618c(z);
            m49509j2();
            m49510m2();
            mo32427p2();
            finish();
        } else if (view.getId() == C8614g.ll_privacy) {
            this.f36138A.toggle();
        } else if (view.getId() == C8614g.tv_privacy_policy) {
            try {
                PrivacyActivity.m49505e2(this, (String) null, this.f36145H);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            int r7 = r7.getFlags()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 & r0
            if (r7 == 0) goto L_0x0024
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r7 = r7.getAction()
            java.lang.String r0 = "android.intent.action.MAIN"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0024
            r6.finish()
            return
        L_0x0024:
            boolean r7 = net.coocent.android.xmlparser.C9502v.m49955z(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r3 = 1
            r4 = 0
            if (r0 < r1) goto L_0x005c
            android.view.Window r1 = r6.getWindow()
            r1.clearFlags(r2)
            android.view.View r2 = r1.getDecorView()
            r5 = 768(0x300, float:1.076E-42)
            r2.setSystemUiVisibility(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r2)
            r1.setNavigationBarColor(r4)
            r2 = 28
            if (r0 < r2) goto L_0x0067
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            r0.layoutInDisplayCutoutMode = r3
            android.view.Window r1 = r6.getWindow()
            r1.setAttributes(r0)
            goto L_0x0067
        L_0x005c:
            r1 = 19
            if (r0 < r1) goto L_0x0067
            android.view.Window r0 = r6.getWindow()
            r0.setFlags(r2, r2)
        L_0x0067:
            android.app.Application r0 = r6.getApplication()
            boolean r0 = r0 instanceof net.coocent.android.xmlparser.application.AbstractApplication
            r1 = 4
            if (r0 == 0) goto L_0x0089
            android.app.Application r0 = r6.getApplication()
            net.coocent.android.xmlparser.application.AbstractApplication r0 = (net.coocent.android.xmlparser.application.AbstractApplication) r0
            int r2 = r0.mo26945h()
            if (r2 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r1 = 6
        L_0x007e:
            r6.f36144G = r1
            int r0 = r0.mo26945h()
            if (r0 != 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            r0 = 0
            goto L_0x008c
        L_0x0089:
            r6.f36144G = r1
        L_0x008b:
            r0 = 1
        L_0x008c:
            r6.mo26640n2()
            boolean r1 = net.coocent.android.xmlparser.p461z.C9566f.m50208s(r6)
            if (r1 != 0) goto L_0x0097
            if (r0 != 0) goto L_0x00d0
        L_0x0097:
            if (r7 == 0) goto L_0x00d0
            int r7 = r6.mo32422l2()
            r6.setContentView((int) r7)
            r6.mo32423o2()
            android.widget.LinearLayout r7 = r6.f36146z
            int r7 = r7.getVisibility()
            if (r7 == 0) goto L_0x00cf
            android.widget.Button r7 = r6.f36139B
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x00b4
            goto L_0x00cf
        L_0x00b4:
            android.widget.Button r7 = r6.f36139B
            r7.setVisibility(r4)
            android.widget.LinearLayout r7 = r6.f36146z
            r7.setVisibility(r4)
            int r7 = p391j.p392a.p393a.C8608a.anim_translate
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r6, r7)
            android.widget.Button r0 = r6.f36139B
            r0.startAnimation(r7)
            android.widget.LinearLayout r0 = r6.f36146z
            r0.startAnimation(r7)
            goto L_0x00dd
        L_0x00cf:
            return
        L_0x00d0:
            r6.m49509j2()
            r6.m49510m2()
            long r0 = r6.f36142E
            r6.m49515v2(r0)
            r6.f36141D = r3
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.activity.AbstractLaunchActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f36140C;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        CountDownTimer countDownTimer;
        super.onPause();
        if (this.f36141D && (countDownTimer = this.f36140C) != null) {
            countDownTimer.cancel();
            this.f36140C = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f36141D && this.f36140C == null) {
            m49515v2(this.f36143F);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo32427p2() {
        startActivity(new Intent(this, mo26639k2()));
        overridePendingTransition(0, 0);
    }
}
