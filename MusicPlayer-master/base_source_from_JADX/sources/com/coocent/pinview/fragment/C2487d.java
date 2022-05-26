package com.coocent.pinview.fragment;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C0084b;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.coocent.pinview.C2479c;
import com.coocent.pinview.C2481e;
import com.coocent.pinview.C2482f;
import com.coocent.pinview.C2491h;
import com.coocent.pinview.C2492i;
import com.coocent.pinview.C2493j;
import com.coocent.pinview.C2494k;
import com.coocent.pinview.C2495l;
import com.coocent.pinview.ForgotPinActivity;
import com.coocent.pinview.fragment.InputLayout;
import com.coocent.pinview.pin.C2511d;
import com.coocent.pinview.pin.IndicatorDots;
import com.coocent.pinview.pin.NumberKeyBoard;

/* renamed from: com.coocent.pinview.fragment.d */
/* compiled from: SetPinFragment */
public class C2487d extends Fragment implements C2511d, View.OnClickListener, InputLayout.C2483a {

    /* renamed from: A0 */
    private final C0084b f8776A0 = new C2488a(false);

    /* renamed from: d0 */
    private C2479c f8777d0;

    /* renamed from: e0 */
    private boolean f8778e0 = false;

    /* renamed from: f0 */
    private Toolbar f8779f0;

    /* renamed from: g0 */
    public boolean f8780g0 = true;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public ConstraintLayout f8781h0;

    /* renamed from: i0 */
    private TextView f8782i0;

    /* renamed from: j0 */
    private int f8783j0 = -16777216;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public IndicatorDots f8784k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public NumberKeyBoard f8785l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ViewGroup f8786m0;

    /* renamed from: n0 */
    private AppCompatTextView f8787n0;

    /* renamed from: o0 */
    private SharedPreferences f8788o0;

    /* renamed from: p0 */
    private boolean f8789p0 = false;

    /* renamed from: q0 */
    private boolean f8790q0 = false;

    /* renamed from: r0 */
    private String f8791r0;

    /* renamed from: s0 */
    private String f8792s0;

    /* renamed from: t0 */
    private InputLayout f8793t0;

    /* renamed from: u0 */
    private InputLayout f8794u0;

    /* renamed from: v0 */
    private InputLayout f8795v0;

    /* renamed from: w0 */
    private AppCompatButton f8796w0;

    /* renamed from: x0 */
    private AppCompatTextView f8797x0;

    /* renamed from: y0 */
    private int f8798y0;

    /* renamed from: z0 */
    private C2481e f8799z0;

    /* renamed from: com.coocent.pinview.fragment.d$a */
    /* compiled from: SetPinFragment */
    class C2488a extends C0084b {
        C2488a(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo400b() {
            if (C2487d.this.f8786m0.getVisibility() == 0) {
                C2487d.this.m11653d3();
                C2487d.this.f8786m0.setVisibility(8);
                C2487d.this.f8781h0.setVisibility(0);
                C2487d.this.f8785l0.mo9649b();
                mo404f(false);
            }
        }
    }

    /* renamed from: com.coocent.pinview.fragment.d$b */
    /* compiled from: SetPinFragment */
    class C2489b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f8801a;

        C2489b(ValueAnimator valueAnimator) {
            this.f8801a = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2487d.this.f8784k0.setTranslationX(((Float) this.f8801a.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: c3 */
    private void m11652c3() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 20.0f, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f});
        ofFloat.addUpdateListener(new C2489b(ofFloat));
        ofFloat.setDuration(500);
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public void m11653d3() {
        InputMethodManager inputMethodManager;
        Context a0 = mo3651a0();
        if (a0 != null && (inputMethodManager = (InputMethodManager) a0.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f8793t0.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void mo9638f3(View view) {
        m11653d3();
        FragmentActivity L = mo3606L();
        C2481e eVar = this.f8799z0;
        if (eVar == null || !eVar.mo9617b().booleanValue()) {
            if (L instanceof AppCompatActivity) {
                ((AppCompatActivity) L).mo3730H1().mo3913F0();
            }
        } else if (L != null) {
            L.finish();
        }
    }

    /* renamed from: g3 */
    public static C2487d m11655g3(boolean z) {
        C2487d dVar = new C2487d();
        dVar.f8780g0 = z;
        return dVar;
    }

    /* renamed from: h3 */
    private void m11656h3(Bundle bundle) {
        if (bundle != null) {
            boolean z = bundle.getBoolean("key-saved-state-show-secret-layout");
            String string = bundle.getString("key-saved-state-password");
            this.f8792s0 = string;
            if (string != null) {
                int i = 0;
                while (i < this.f8792s0.length()) {
                    i++;
                    this.f8784k0.mo9642d(i);
                }
                this.f8785l0.setPassword(this.f8792s0);
            }
            if (z) {
                this.f8786m0.setVisibility(0);
                this.f8781h0.setVisibility(8);
                this.f8787n0.setText(mo3585E0(C2495l.set_secret_pin_tips, this.f8792s0));
                this.f8776A0.mo404f(true);
                String string2 = bundle.getString("key-saved-state-secret-question");
                if (string2 != null) {
                    this.f8793t0.setText(string2);
                }
                String string3 = bundle.getString("key-saved-state-secret-answer");
                if (string3 != null) {
                    this.f8794u0.setText(string3);
                }
                String string4 = bundle.getString("key-saved-state-secret-answer-confirm");
                if (string4 != null) {
                    this.f8795v0.setText(string4);
                }
            }
        }
    }

    /* renamed from: j3 */
    private void m11657j3() {
        this.f8793t0.mo9620B();
        this.f8794u0.mo9620B();
        this.f8795v0.mo9620B();
        this.f8786m0.setVisibility(0);
        this.f8781h0.setVisibility(8);
        this.f8787n0.setText(mo3585E0(C2495l.set_secret_pin_tips, this.f8792s0));
        this.f8776A0.mo404f(true);
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        this.f8776A0.mo404f(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9605I0(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4.f8789p0
            r1 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r4.f8791r0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r4.f8790q0
            if (r0 == 0) goto L_0x0056
            com.coocent.pinview.e r0 = r4.f8799z0
            if (r0 == 0) goto L_0x0057
            androidx.fragment.app.Fragment r0 = r0.mo9618c()
            if (r0 == 0) goto L_0x0057
            androidx.fragment.app.j r2 = r4.mo3642W()
            androidx.fragment.app.p r2 = r2.mo3957i()
            int r3 = com.coocent.pinview.C2492i.child_container
            r2.mo4068b(r3, r0)
            r2.mo3816j()
            goto L_0x0057
        L_0x002c:
            r4.m11652c3()
            android.widget.TextView r0 = r4.f8782i0
            java.lang.String r2 = "#ff1414"
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r4.f8782i0
            int r2 = com.coocent.pinview.C2495l.coocent_wrong_password
            r0.setText(r2)
            com.coocent.pinview.pin.NumberKeyBoard r0 = r4.f8785l0
            r0.mo9649b()
            android.content.Context r0 = r4.mo3651a0()
            if (r0 == 0) goto L_0x0057
            int r2 = com.coocent.pinview.C2495l.coocent_wrong_pin_code
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            goto L_0x0057
        L_0x0056:
            r1 = 1
        L_0x0057:
            if (r1 == 0) goto L_0x005e
            r4.f8792s0 = r5
            r4.m11657j3()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.pinview.fragment.C2487d.mo9605I0(java.lang.String):void");
    }

    /* renamed from: Q1 */
    public void mo3623Q1() {
        super.mo3623Q1();
        String string = this.f8788o0.getString("key-private-password", (String) null);
        if (string != null) {
            this.f8791r0 = string;
        }
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        super.mo3626R1(bundle);
        bundle.putString("key-saved-state-password", this.f8785l0.getPassword());
        bundle.putBoolean("key-saved-state-show-secret-layout", this.f8786m0.getVisibility() == 0);
        bundle.putString("key-saved-state-secret-question", this.f8793t0.getText());
        bundle.putString("key-saved-state-secret-answer", this.f8794u0.getText());
        bundle.putString("key-saved-state-secret-answer-confirm", this.f8794u0.getText());
    }

    /* renamed from: T */
    public void mo9606T() {
        String text = this.f8793t0.getText();
        String text2 = this.f8794u0.getText();
        String text3 = this.f8795v0.getText();
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text2) || TextUtils.isEmpty(text3)) {
            this.f8796w0.setEnabled(false);
        } else {
            this.f8796w0.setEnabled(true);
        }
        this.f8795v0.setInputSelected(false);
        this.f8797x0.setText(C2495l.set_secret_tips);
        this.f8797x0.setTextColor(this.f8798y0);
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        super.mo3636U1(view, bundle);
        view.setOnClickListener(this);
        view.setBackgroundResource(this.f8778e0 ? C2482f.dark_fragment_set_pin_bg : C2482f.fragment_set_pin_bg);
        Toolbar toolbar = (Toolbar) view.findViewById(C2492i.set_pin_toolbar);
        this.f8779f0 = toolbar;
        if (!this.f8780g0) {
            toolbar.setVisibility(8);
        }
        this.f8779f0.setNavigationIcon(this.f8778e0 ? C2494k.encrypt_ic_return_white : C2494k.encrypt_ic_return);
        this.f8779f0.setBackgroundResource(this.f8778e0 ? C2482f.dark_toolbar_bg : C2482f.toolbar_bg);
        this.f8779f0.setNavigationOnClickListener(new C2486c(this));
        this.f8779f0.setTitleTextColor(C0506a.m3150b(view.getContext(), this.f8778e0 ? C2482f.dark_fragment_media_title : C2482f.fragment_media_title));
        this.f8782i0 = (TextView) view.findViewById(C2492i.enter_pin_tips);
        int b = C0506a.m3150b(view.getContext(), this.f8778e0 ? C2482f.dark_enter_pin_tips_text : C2482f.enter_pin_tips_text);
        this.f8783j0 = b;
        this.f8782i0.setTextColor(b);
        IndicatorDots indicatorDots = (IndicatorDots) view.findViewById(C2492i.set_pin_dot);
        this.f8784k0 = indicatorDots;
        indicatorDots.setPinLength(4);
        NumberKeyBoard numberKeyBoard = (NumberKeyBoard) view.findViewById(C2492i.set_pin_lockView);
        this.f8785l0 = numberKeyBoard;
        numberKeyBoard.setPinLength(4);
        this.f8785l0.setPinLockListener(this);
        this.f8785l0.mo9648a(this.f8784k0);
        if (this.f8789p0) {
            this.f8782i0.setText(C2495l.coocent_enter_pin_code);
            Toolbar toolbar2 = this.f8779f0;
            if (this.f8778e0) {
                i4 = C2491h.common_btn_back_black_dark;
            } else {
                i4 = C2491h.common_btn_back_black;
            }
            toolbar2.setNavigationIcon(i4);
            this.f8779f0.setTitle(C2495l.pin_have_password_title);
        }
        TextView textView = (TextView) view.findViewById(C2492i.cgallery_retrievePassword);
        textView.setOnClickListener(this);
        if (this.f8790q0) {
            textView.setVisibility(0);
        }
        this.f8786m0 = (ViewGroup) view.findViewById(C2492i.set_secret_security_layout);
        this.f8781h0 = (ConstraintLayout) view.findViewById(C2492i.enter_pin_layout);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C2492i.set_secret_pin_tips);
        this.f8787n0 = appCompatTextView;
        appCompatTextView.setTextColor(C0506a.m3150b(appCompatTextView.getContext(), this.f8778e0 ? C2482f.dark_email_title : C2482f.email_title));
        this.f8797x0 = (AppCompatTextView) view.findViewById(C2492i.set_secret_tips);
        Context context = view.getContext();
        if (this.f8778e0) {
            i = C2482f.dark_fragment_email_hint;
        } else {
            i = C2482f.fragment_email_hint;
        }
        int b2 = C0506a.m3150b(context, i);
        this.f8798y0 = b2;
        this.f8797x0.setTextColor(b2);
        AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(C2492i.btn_confirm);
        this.f8796w0 = appCompatButton;
        appCompatButton.setOnClickListener(this);
        AppCompatButton appCompatButton2 = this.f8796w0;
        if (this.f8778e0) {
            i2 = C2491h.cgallery_bg_round_rect_dark;
        } else {
            i2 = C2491h.cgallery_bg_round_rect;
        }
        appCompatButton2.setBackgroundResource(i2);
        this.f8793t0 = (InputLayout) view.findViewById(C2492i.set_secret_question);
        this.f8794u0 = (InputLayout) view.findViewById(C2492i.set_secret_answer);
        this.f8795v0 = (InputLayout) view.findViewById(C2492i.set_secret_answer_confirm);
        this.f8793t0.setDarkMode(this.f8778e0);
        this.f8794u0.setDarkMode(this.f8778e0);
        this.f8795v0.setDarkMode(this.f8778e0);
        this.f8793t0.setOnTextChangeCallback(this);
        this.f8794u0.setOnTextChangeCallback(this);
        this.f8795v0.setOnTextChangeCallback(this);
        this.f8793t0.setSecret(false);
        this.f8794u0.setSecret(true);
        this.f8795v0.setSecret(true);
        this.f8793t0.setInputHint(C2495l.set_secret_question_input_hint);
        this.f8794u0.setInputHint(C2495l.set_secret_answer_input_hint);
        this.f8795v0.setInputHint(C2495l.set_secret_answer_confirm_input_hint);
        Context context2 = view.getContext();
        if (this.f8778e0) {
            i3 = C2482f.dark_set_secret_security_question_txt;
        } else {
            i3 = C2482f.set_secret_security_question_txt;
        }
        int b3 = C0506a.m3150b(context2, i3);
        ((AppCompatTextView) view.findViewById(C2492i.set_secret_answer_txt)).setTextColor(b3);
        ((AppCompatTextView) view.findViewById(C2492i.set_secret_security_question)).setTextColor(b3);
        m11656h3(bundle);
    }

    /* renamed from: h1 */
    public void mo3669h1(Context context) {
        super.mo3669h1(context);
        FragmentActivity L = mo3606L();
        if (L instanceof C2479c) {
            this.f8777d0 = (C2479c) L;
        }
        Fragment p0 = mo3690p0();
        if (p0 instanceof C2479c) {
            this.f8777d0 = (C2479c) p0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        this.f8788o0 = sharedPreferences;
        String string = sharedPreferences.getString("key-private-password", (String) null);
        C2479c cVar = this.f8777d0;
        if (cVar != null) {
            this.f8778e0 = cVar.mo9612I();
            this.f8791r0 = this.f8777d0.mo9613J0();
        }
        if (string != null) {
            this.f8791r0 = string;
        }
        String str = this.f8791r0;
        if (str != null && !str.isEmpty()) {
            this.f8789p0 = true;
        }
        this.f8790q0 = this.f8788o0.getBoolean("key-have-secret-question", false);
    }

    /* renamed from: i3 */
    public void mo9639i3(C2481e eVar) {
        this.f8799z0 = eVar;
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        FragmentActivity L = mo3606L();
        if (L instanceof AppCompatActivity) {
            ((AppCompatActivity) L).mo391z().mo395a(this, this.f8776A0);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C2492i.cgallery_retrievePassword) {
            Context a0 = mo3651a0();
            if (a0 != null) {
                Intent intent = new Intent(a0, ForgotPinActivity.class);
                intent.putExtra("key_dark_mode", this.f8778e0);
                intent.putExtra("key-screen-flip", this.f8777d0.mo9614W());
                a0.startActivity(intent);
            }
            this.f8782i0.setText(C2495l.coocent_enter_pin_code);
            this.f8782i0.setTextColor(this.f8783j0);
            this.f8785l0.mo9649b();
        } else if (id == C2492i.btn_confirm) {
            String text = this.f8793t0.getText();
            String text2 = this.f8794u0.getText();
            String text3 = this.f8795v0.getText();
            if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text3)) {
                boolean z = true;
                if (TextUtils.equals(text2, text3)) {
                    this.f8776A0.mo404f(false);
                    this.f8788o0.edit().putString("key-secret-question", text).putString("key-secret-answer", text2).putBoolean("key-have-secret-question", true).putString("key-private-password", this.f8792s0).apply();
                    C2481e eVar = this.f8799z0;
                    if (eVar != null) {
                        eVar.mo9616a();
                        if (this.f8799z0.mo9619d()) {
                            Fragment c = this.f8799z0.mo9618c();
                            this.f8786m0.setVisibility(8);
                            if (c != null) {
                                C0620p i = mo3642W().mo3957i();
                                i.mo4068b(C2492i.child_container, c);
                                i.mo3816j();
                                z = false;
                            }
                        }
                    }
                    C2479c cVar = this.f8777d0;
                    if (cVar != null) {
                        cVar.mo9615j1(this.f8792s0);
                    }
                    FragmentActivity L = mo3606L();
                    if (L instanceof AppCompatActivity) {
                        m11653d3();
                        Toast.makeText(L, C2495l.coocent_results_page_save_complete, 0).show();
                        if (z) {
                            ((AppCompatActivity) L).mo3730H1().mo3913F0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f8797x0.setTextColor(Color.parseColor("#f53737"));
                this.f8797x0.setText(C2495l.set_secret_answer_inconsistent_tip);
                this.f8796w0.setEnabled(false);
                this.f8795v0.setInputSelected(true);
            }
        }
    }

    /* renamed from: t0 */
    public void mo9609t0(int i, String str) {
        if (i > 0) {
            if (this.f8789p0) {
                this.f8782i0.setText(C2495l.coocent_enter_pin_code);
            } else {
                this.f8782i0.setText(C2495l.coocent_restr_pin_enter_new_pin);
            }
            this.f8782i0.setTextColor(this.f8783j0);
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2493j.fragment_set_pin_layout, viewGroup, false);
    }

    /* renamed from: w1 */
    public void mo9610w1() {
    }
}
