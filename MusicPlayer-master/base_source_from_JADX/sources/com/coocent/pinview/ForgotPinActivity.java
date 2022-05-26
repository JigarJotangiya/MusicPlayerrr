package com.coocent.pinview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0506a;
import com.coocent.pinview.fragment.InputLayout;
import com.coocent.pinview.pin.C2511d;
import com.coocent.pinview.pin.IndicatorDots;
import com.coocent.pinview.pin.NumberKeyBoard;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class ForgotPinActivity extends AppCompatActivity implements InputLayout.C2483a, View.OnClickListener, C2511d {

    /* renamed from: A */
    private int f8759A = -16777216;

    /* renamed from: B */
    private SharedPreferences f8760B;

    /* renamed from: C */
    private InputLayout f8761C;

    /* renamed from: D */
    private AppCompatButton f8762D;

    /* renamed from: E */
    private String f8763E;

    /* renamed from: F */
    private ConstraintLayout f8764F;

    /* renamed from: G */
    private boolean f8765G = false;

    /* renamed from: H */
    private NumberKeyBoard f8766H;

    /* renamed from: z */
    private AppCompatTextView f8767z;

    /* renamed from: d2 */
    private void m11622d2(boolean z) {
        Window window = getWindow();
        window.setSoftInputMode(32);
        window.clearFlags(1024);
        window.clearFlags(134217728);
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && !z) {
            systemUiVisibility |= 8192;
            if (i >= 26) {
                systemUiVisibility |= 16;
            }
        }
        decorView.setSystemUiVisibility(1024 | systemUiVisibility | 512 | 256);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(C0506a.m3150b(this, z ? C2482f.dark_toolbar_bg : C2482f.toolbar_bg));
        window.setStatusBarColor(C0506a.m3150b(this, z ? C2482f.dark_toolbar_bg : C2482f.toolbar_bg));
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void mo9607g2(View view) {
        finish();
    }

    /* renamed from: I0 */
    public void mo9605I0(String str) {
        this.f8760B.edit().putString("key-private-password", str).apply();
        Toast.makeText(this, C2495l.reset_pin_success, 0).show();
        onBackPressed();
    }

    /* renamed from: T */
    public void mo9606T() {
        this.f8762D.setEnabled(!TextUtils.isEmpty(this.f8761C.getText()));
        this.f8761C.setInputSelected(false);
        this.f8767z.setText(C2495l.forgot_pin_tips);
        this.f8767z.setTextColor(this.f8759A);
    }

    public void onClick(View view) {
        if (view.getId() == C2492i.btn_confirm) {
            if (TextUtils.equals(this.f8763E, this.f8761C.getText())) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.f8761C.getWindowToken(), 0);
                }
                this.f8761C.setVisibility(8);
                this.f8762D.setVisibility(8);
                this.f8764F.setVisibility(0);
                return;
            }
            this.f8767z.setTextColor(Color.parseColor("#f53737"));
            this.f8767z.setText(C2495l.set_secret_answer_inconsistent_tip);
            this.f8762D.setEnabled(false);
            this.f8761C.setInputSelected(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            this.f8765G = true;
        }
        Intent intent = getIntent();
        int i4 = -1;
        if (intent != null) {
            this.f8765G = intent.getBooleanExtra("key_dark_mode", this.f8765G);
            i4 = intent.getIntExtra("key-screen-flip", -1);
        }
        m11622d2(this.f8765G);
        setContentView(C2493j.activity_forgot_pin_layout);
        findViewById(C2492i.root_layout).setBackgroundResource(this.f8765G ? C2482f.dark_fragment_set_pin_bg : C2482f.fragment_set_pin_bg);
        int i5 = 0;
        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName(), 0);
        this.f8760B = sharedPreferences;
        this.f8763E = sharedPreferences.getString("key-secret-answer", BuildConfig.FLAVOR);
        Toolbar toolbar = (Toolbar) findViewById(C2492i.forgot_pin_toolbar);
        toolbar.setNavigationOnClickListener(new C2477a(this));
        toolbar.setTitleTextColor(C0506a.m3150b(this, this.f8765G ? C2482f.dark_fragment_media_title : C2482f.fragment_media_title));
        toolbar.setBackgroundResource(this.f8765G ? C2482f.dark_toolbar_bg : C2482f.toolbar_bg);
        if (this.f8765G) {
            i = C2494k.encrypt_ic_return_white;
        } else {
            i = C2494k.encrypt_ic_return;
        }
        toolbar.setNavigationIcon(i);
        this.f8767z = (AppCompatTextView) findViewById(C2492i.forgot_pin_tips);
        int b = C0506a.m3150b(this, this.f8765G ? C2482f.dark_enter_pin_tips_text : C2482f.enter_pin_tips_text);
        this.f8759A = b;
        this.f8767z.setTextColor(b);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(C2492i.forgot_pin_question);
        appCompatTextView.setText(this.f8760B.getString("key-secret-question", BuildConfig.FLAVOR));
        if (this.f8765G) {
            i2 = C2482f.dark_set_secret_security_question_txt;
        } else {
            i2 = C2482f.set_secret_security_question_txt;
        }
        appCompatTextView.setTextColor(C0506a.m3150b(this, i2));
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(C2492i.btn_confirm);
        this.f8762D = appCompatButton;
        appCompatButton.setOnClickListener(this);
        AppCompatButton appCompatButton2 = this.f8762D;
        if (this.f8765G) {
            i3 = C2491h.cgallery_bg_round_rect_dark;
        } else {
            i3 = C2491h.cgallery_bg_round_rect;
        }
        appCompatButton2.setBackgroundResource(i3);
        InputLayout inputLayout = (InputLayout) findViewById(C2492i.forgot_pin_input);
        this.f8761C = inputLayout;
        inputLayout.setOnTextChangeCallback(this);
        this.f8761C.setInputHint(C2495l.set_secret_answer_input_hint);
        this.f8761C.setSecret(true);
        this.f8761C.setDarkMode(this.f8765G);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C2492i.enter_pin_layout);
        this.f8764F = constraintLayout;
        constraintLayout.setBackgroundResource(this.f8765G ? C2482f.dark_fragment_set_pin_bg : C2482f.fragment_set_pin_bg);
        IndicatorDots indicatorDots = (IndicatorDots) findViewById(C2492i.set_pin_dot);
        indicatorDots.setPinLength(4);
        NumberKeyBoard numberKeyBoard = (NumberKeyBoard) findViewById(C2492i.set_pin_lockView);
        this.f8766H = numberKeyBoard;
        numberKeyBoard.setPinLength(4);
        this.f8766H.setPinLockListener(this);
        this.f8766H.mo9648a(indicatorDots);
        ((TextView) findViewById(C2492i.enter_pin_tips)).setTextColor(this.f8759A);
        if (bundle != null) {
            if (bundle.getBoolean("key-show-enter-pin")) {
                this.f8762D.setVisibility(8);
                this.f8761C.setVisibility(8);
                this.f8764F.setVisibility(0);
            }
            String string = bundle.getString("key-input-text");
            if (string != null) {
                this.f8761C.setText(string);
            }
            String string2 = bundle.getString("key-password");
            if (string2 != null) {
                while (i5 < string2.length()) {
                    i5++;
                    indicatorDots.mo9642d(i5);
                }
                this.f8766H.setPassword(string2);
            }
        }
        if (i4 == 0) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("key-input-text", this.f8761C.getText());
        bundle.putBoolean("key-show-enter-pin", this.f8764F.getVisibility() == 0);
        bundle.putString("key-password", this.f8766H.getPassword());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (getResources().getConfiguration().orientation == 2) {
            window.addFlags(1024);
        } else {
            window.clearFlags(1024);
        }
    }

    /* renamed from: t0 */
    public void mo9609t0(int i, String str) {
    }

    /* renamed from: w1 */
    public void mo9610w1() {
    }
}
