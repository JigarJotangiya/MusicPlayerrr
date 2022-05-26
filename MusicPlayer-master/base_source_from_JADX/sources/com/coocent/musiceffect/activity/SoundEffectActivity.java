package com.coocent.musiceffect.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.RecyclerView;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.C4507b;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p202j.C4528d;
import p159f.p166c.p201g.p203k.C4533a;
import p159f.p166c.p201g.p208p.C4565a;
import p159f.p166c.p201g.p208p.C4568c;
import p159f.p166c.p201g.p208p.C4570e;
import p159f.p166c.p201g.p208p.C4573g;

public class SoundEffectActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private ImageView f8657A;

    /* renamed from: B */
    private TextView f8658B;

    /* renamed from: C */
    private ImageView f8659C;

    /* renamed from: D */
    private RecyclerView f8660D;

    /* renamed from: E */
    private FrameLayout f8661E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f8662F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C4528d f8663G;

    /* renamed from: H */
    private C4533a f8664H;

    /* renamed from: I */
    private BroadcastReceiver f8665I = new C2464b();

    /* renamed from: z */
    private ImageView f8666z;

    /* renamed from: com.coocent.musiceffect.activity.SoundEffectActivity$a */
    class C2463a implements C4528d.C4530b {
        C2463a() {
        }

        /* renamed from: a */
        public void mo9529a(int i) {
            if (i != SoundEffectActivity.this.f8663G.mo15222e()) {
                SoundEffectActivity.this.m11552q2(true);
                C4565a.m19902a().mo15298i(SoundEffectActivity.this, i);
                SoundEffectActivity.this.m11549n2();
                if (SoundEffectActivity.this.f8662F) {
                    SoundEffectActivity.this.m11551p2();
                    if (i == 0) {
                        C4507b.m19754j(C4506a.m19729c());
                        C4507b.m19750f(0);
                        C4507b.m19759o(0);
                        C4507b.m19756l(0);
                    } else if (i == 1) {
                        C4507b.m19754j(C4506a.m19733g());
                        C4507b.m19750f(0);
                        C4507b.m19759o(888);
                        C4507b.m19756l(0);
                    } else if (i == 2) {
                        C4507b.m19754j(C4506a.m19738l());
                        C4507b.m19750f(0);
                        C4507b.m19759o(0);
                        C4507b.m19756l(0);
                    } else if (i == 3) {
                        C4507b.m19754j(C4506a.m19733g());
                        C4507b.m19750f(0);
                        C4507b.m19759o(1000);
                        C4507b.m19756l(0);
                    } else if (i == 4) {
                        C4507b.m19754j(C4506a.m19732f());
                        C4507b.m19750f(0);
                        C4507b.m19759o(0);
                        C4507b.m19756l(0);
                    } else if (i == 5) {
                        C4507b.m19754j(C4506a.m19728b());
                        C4507b.m19750f(0);
                        C4507b.m19759o(0);
                        C4507b.m19756l(0);
                    }
                    C4507b.m19753i(true);
                    return;
                }
                C4507b.m19757m();
            }
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.SoundEffectActivity$b */
    class C2464b extends BroadcastReceiver {
        C2464b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (C4506a.m19739m(context).equals(intent.getAction())) {
                SoundEffectActivity.this.m11549n2();
            }
        }
    }

    /* renamed from: j2 */
    private boolean m11545j2() {
        if (this.f8662F) {
            return C4565a.m19902a().f13259b;
        }
        return C4565a.m19902a().f13263f;
    }

    /* renamed from: k2 */
    private void m11546k2() {
        m11549n2();
        m11551p2();
    }

    /* renamed from: l2 */
    private void m11547l2() {
        this.f8666z.setOnClickListener(this);
        this.f8657A.setOnClickListener(this);
        this.f8658B.setOnClickListener(this);
        this.f8659C.setOnClickListener(this);
        this.f8663G.mo15225h(new C2463a());
    }

    /* renamed from: m2 */
    private void m11548m2() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C4506a.m19739m(this));
        registerReceiver(this.f8665I, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m11549n2() {
        boolean j2 = m11545j2();
        int i = C4565a.m19902a().f13264g;
        try {
            this.f8659C.setSelected(j2);
            this.f8658B.setTextColor(C0506a.m3150b(this, j2 ? C4509d.effect_accent : C4509d.effect_textcolor));
            if (j2) {
                this.f8663G.mo15226i(i);
            } else {
                this.f8663G.mo15226i(-1);
            }
            if (i >= 0) {
                this.f8658B.setText(this.f8663G.mo15221d(i));
            } else if (this.f8662F) {
                this.f8658B.setText(C4513h.effect_custom);
            } else {
                this.f8658B.setText(C4513h.equalizer2_none);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o2 */
    private void m11550o2() {
        this.f8666z = (ImageView) findViewById(C4511f.iv_back);
        ImageView imageView = (ImageView) findViewById(C4511f.iv_equalizer);
        this.f8657A = imageView;
        imageView.setVisibility(this.f8662F ? 0 : 8);
        this.f8658B = (TextView) findViewById(C4511f.tv_current_effect);
        this.f8659C = (ImageView) findViewById(C4511f.iv_switch);
        this.f8660D = (RecyclerView) findViewById(C4511f.rv_effect);
        FrameLayout frameLayout = (FrameLayout) findViewById(C4511f.ad_layout);
        this.f8661E = frameLayout;
        C4570e.m19971b(this, frameLayout);
        C4528d dVar = new C4528d(this);
        this.f8663G = dVar;
        this.f8660D.setAdapter(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m11551p2() {
        if (this.f8662F) {
            int i = C4565a.m19902a().f13264g;
            if (i == 0) {
                C4568c.m19958q(this, C4506a.m19729c());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 0);
                C4568c.m19959r(this, 0);
            } else if (i == 1) {
                C4568c.m19958q(this, C4506a.m19733g());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 888);
                C4568c.m19959r(this, 0);
            } else if (i == 2) {
                C4568c.m19958q(this, C4506a.m19738l());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 0);
                C4568c.m19959r(this, 0);
            } else if (i == 3) {
                C4568c.m19958q(this, C4506a.m19733g());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 1000);
                C4568c.m19959r(this, 0);
            } else if (i == 4) {
                C4568c.m19958q(this, C4506a.m19732f());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 0);
                C4568c.m19959r(this, 0);
            } else if (i == 5) {
                C4568c.m19958q(this, C4506a.m19728b());
                C4568c.m19956o(this, 0);
                C4568c.m19960s(this, 0);
                C4568c.m19959r(this, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public void m11552q2(boolean z) {
        if (this.f8662F) {
            C4565a.m19902a().mo15294e(this, z);
        } else {
            C4565a.m19902a().mo15297h(this, z);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4511f.iv_back) {
            onBackPressed();
        } else if (id == C4511f.iv_equalizer || id == C4511f.tv_current_effect) {
            if (this.f8662F) {
                startActivity(new Intent(this, EffectAdjustActivity.class));
            }
        } else if (id == C4511f.iv_switch) {
            boolean z = !m11545j2();
            m11552q2(z);
            if (z && !this.f8662F && C4565a.m19902a().f13264g < 0) {
                C4565a.m19902a().mo15298i(this, 0);
            }
            m11549n2();
            if (this.f8662F) {
                C4507b.m19753i(z);
            } else {
                C4507b.m19757m();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C4573g.m19978a(this, !C4573g.m19979b(getResources().getColor(C4509d.effect_bg)));
        super.onCreate(bundle);
        setContentView(C4512g.activity_sound_effect);
        if (getIntent() != null) {
            this.f8662F = getIntent().getBooleanExtra("useAdjust", false);
        }
        this.f8664H = new C4533a(this);
        m11550o2();
        m11546k2();
        m11547l2();
        m11548m2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4570e.m19970a();
        FrameLayout frameLayout = this.f8661E;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f8661E = null;
        }
        try {
            unregisterReceiver(this.f8665I);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C4533a aVar = this.f8664H;
        if (aVar == null || !aVar.mo15228f(i)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4533a aVar = this.f8664H;
        if (aVar != null) {
            aVar.mo15229g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m11549n2();
    }
}
