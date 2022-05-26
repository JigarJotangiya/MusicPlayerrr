package coocent.musiclibrary.music.p284e;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import coocent.musiclibrary.music.p292j.C7398k;
import p159f.p166c.p218l.C4604d;
import p342g.p359b.C8347a;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8353g;
import p369i.C8446k;
import p369i.C8457t;
import p369i.p387z.p388c.C8575q;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: coocent.musiclibrary.music.e.h */
/* compiled from: TimerSleepDialog.kt */
public final class C7344h extends AlertDialog {

    /* renamed from: s */
    public static final C7345a f32367s = new C7345a((C8589g) null);

    /* renamed from: t */
    private static long f32368t;

    /* renamed from: g */
    private int f32369g;

    /* renamed from: h */
    private boolean f32370h;

    /* renamed from: i */
    private LinearLayout[] f32371i;

    /* renamed from: j */
    private TextView f32372j;

    /* renamed from: k */
    private CheckBox f32373k;

    /* renamed from: l */
    private TextView f32374l;

    /* renamed from: m */
    private TextView f32375m;

    /* renamed from: n */
    private int f32376n;

    /* renamed from: o */
    private RadioButton[] f32377o;

    /* renamed from: p */
    private C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> f32378p;

    /* renamed from: q */
    private RadioButton f32379q;

    /* renamed from: r */
    public TextView f32380r;

    /* renamed from: coocent.musiclibrary.music.e.h$a */
    /* compiled from: TimerSleepDialog.kt */
    public static final class C7345a {
        private C7345a() {
        }

        public /* synthetic */ C7345a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7344h mo28088a(Context context, int i, boolean z, C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> qVar) {
            C8594l.m46771e(context, "context");
            C7344h hVar = new C7344h(context, i, z);
            hVar.m41525k(qVar);
            return hVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7344h(Context context, int i, boolean z) {
        super(context);
        C8594l.m46771e(context, "context");
        this.f32369g = i;
        this.f32370h = z;
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: c */
    private final void m41518c() {
        this.f32376n = this.f32369g;
        RadioButton[] radioButtonArr = this.f32377o;
        if (radioButtonArr != null) {
            int length = radioButtonArr.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i == this.f32369g) {
                        RadioButton[] radioButtonArr2 = this.f32377o;
                        if (radioButtonArr2 != null) {
                            radioButtonArr2[i].setChecked(true);
                            if (i == 6) {
                                mo28084b().setText(C7398k.f32508a.mo28206b(f32368t / ((long) 1000)));
                            }
                        } else {
                            C8594l.m46783q("rbs");
                            throw null;
                        }
                    } else {
                        RadioButton[] radioButtonArr3 = this.f32377o;
                        if (radioButtonArr3 != null) {
                            radioButtonArr3[i].setChecked(false);
                        } else {
                            C8594l.m46783q("rbs");
                            throw null;
                        }
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
            CheckBox checkBox = this.f32373k;
            if (checkBox != null) {
                checkBox.setChecked(this.f32370h);
            } else {
                C8594l.m46783q("cbOverToStop");
                throw null;
            }
        } else {
            C8594l.m46783q("rbs");
            throw null;
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: d */
    private final void m41519d() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        setContentView(C8351e.dialog_timer_sleep);
        RadioButton radioButton = (RadioButton) findViewById(C8350d.rb_1);
        RadioButton radioButton2 = (RadioButton) findViewById(C8350d.rb_2);
        RadioButton radioButton3 = (RadioButton) findViewById(C8350d.rb_3);
        RadioButton radioButton4 = (RadioButton) findViewById(C8350d.rb_4);
        RadioButton radioButton5 = (RadioButton) findViewById(C8350d.rb_5);
        RadioButton radioButton6 = (RadioButton) findViewById(C8350d.rb_6);
        View findViewById = findViewById(C8350d.rb_7);
        C8594l.m46770d(findViewById, "findViewById(R.id.rb_7)");
        this.f32379q = (RadioButton) findViewById;
        LinearLayout linearLayout3 = (LinearLayout) findViewById(C8350d.ll_1);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(C8350d.ll_2);
        LinearLayout linearLayout5 = (LinearLayout) findViewById(C8350d.ll_3);
        LinearLayout linearLayout6 = (LinearLayout) findViewById(C8350d.ll_4);
        LinearLayout linearLayout7 = (LinearLayout) findViewById(C8350d.ll_5);
        LinearLayout linearLayout8 = (LinearLayout) findViewById(C8350d.ll_6);
        LinearLayout linearLayout9 = (LinearLayout) findViewById(C8350d.ll_7);
        View findViewById2 = findViewById(C8350d.tv_custom_text);
        C8594l.m46770d(findViewById2, "findViewById(R.id.tv_custom_text)");
        mo28085j((TextView) findViewById2);
        View findViewById3 = findViewById(C8350d.dialog_ok);
        C8594l.m46770d(findViewById3, "findViewById<RadioButton>(R.id.dialog_ok)");
        this.f32375m = (TextView) findViewById3;
        View findViewById4 = findViewById(C8350d.dialog_cancel);
        C8594l.m46770d(findViewById4, "findViewById<RadioButton>(R.id.dialog_cancel)");
        this.f32374l = (TextView) findViewById4;
        TextView textView = this.f32375m;
        if (textView != null) {
            Resources resources = getContext().getResources();
            LinearLayout linearLayout10 = linearLayout9;
            int i = C8347a.colorAccent;
            textView.setTextColor(resources.getColor(i));
            TextView textView2 = this.f32374l;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(i));
                View findViewById5 = findViewById(C8350d.cb_over_to_stop);
                C8594l.m46770d(findViewById5, "findViewById(R.id.cb_over_to_stop)");
                this.f32373k = (CheckBox) findViewById5;
                View findViewById6 = findViewById(C8350d.tv_timer_sleep_time_tip);
                C8594l.m46770d(findViewById6, "findViewById(R.id.tv_timer_sleep_time_tip)");
                TextView textView3 = (TextView) findViewById6;
                this.f32372j = textView3;
                if (f32368t == 0 || this.f32369g == 0) {
                    linearLayout2 = linearLayout7;
                    linearLayout = linearLayout8;
                    f32368t = 0;
                    if (textView3 != null) {
                        textView3.setText(getContext().getResources().getString(C8353g.sleep_timer_none));
                    } else {
                        C8594l.m46783q("timerSleepTimeTip");
                        throw null;
                    }
                } else if (textView3 != null) {
                    linearLayout2 = linearLayout7;
                    linearLayout = linearLayout8;
                    textView3.setText(C8594l.m46777k(C7398k.f32508a.mo28206b(f32368t / ((long) 1000)), getContext().getResources().getString(C8353g.sleep_timer_time_tip2)));
                } else {
                    C8594l.m46783q("timerSleepTimeTip");
                    throw null;
                }
                RadioButton[] radioButtonArr = new RadioButton[7];
                C8594l.m46770d(radioButton, "rb1");
                radioButtonArr[0] = radioButton;
                C8594l.m46770d(radioButton2, "rb2");
                radioButtonArr[1] = radioButton2;
                C8594l.m46770d(radioButton3, "rb3");
                radioButtonArr[2] = radioButton3;
                C8594l.m46770d(radioButton4, "rb4");
                radioButtonArr[3] = radioButton4;
                C8594l.m46770d(radioButton5, "rb5");
                radioButtonArr[4] = radioButton5;
                C8594l.m46770d(radioButton6, "rb6");
                radioButtonArr[5] = radioButton6;
                RadioButton radioButton7 = this.f32379q;
                if (radioButton7 != null) {
                    radioButtonArr[6] = radioButton7;
                    this.f32377o = radioButtonArr;
                    C8594l.m46770d(linearLayout3, "ll1");
                    C8594l.m46770d(linearLayout4, "ll2");
                    C8594l.m46770d(linearLayout5, "ll3");
                    C8594l.m46770d(linearLayout6, "ll4");
                    LinearLayout linearLayout11 = linearLayout2;
                    C8594l.m46770d(linearLayout11, "ll5");
                    LinearLayout linearLayout12 = linearLayout;
                    C8594l.m46770d(linearLayout12, "ll6");
                    LinearLayout linearLayout13 = linearLayout10;
                    C8594l.m46770d(linearLayout13, "ll7");
                    this.f32371i = new LinearLayout[]{linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout11, linearLayout12, linearLayout13};
                    return;
                }
                C8594l.m46783q("rb7");
                throw null;
            }
            C8594l.m46783q("dialogCancel");
            throw null;
        }
        C8594l.m46783q("dialogOk");
        throw null;
    }

    /* renamed from: i */
    public static final C7344h m41524i(Context context, int i, boolean z, C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> qVar) {
        return f32367s.mo28088a(context, i, z, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m41525k(C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> qVar) {
        this.f32378p = qVar;
    }

    /* renamed from: l */
    private final void m41526l(int i) {
        LinearLayout[] linearLayoutArr = this.f32371i;
        if (linearLayoutArr != null) {
            int length = linearLayoutArr.length - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 == i) {
                        RadioButton[] radioButtonArr = this.f32377o;
                        if (radioButtonArr != null) {
                            radioButtonArr[i2].setChecked(true);
                            this.f32376n = i2;
                        } else {
                            C8594l.m46783q("rbs");
                            throw null;
                        }
                    } else {
                        RadioButton[] radioButtonArr2 = this.f32377o;
                        if (radioButtonArr2 != null) {
                            radioButtonArr2[i2].setChecked(false);
                        } else {
                            C8594l.m46783q("rbs");
                            throw null;
                        }
                    }
                    if (i3 <= length) {
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C8594l.m46783q("lls");
            throw null;
        }
    }

    /* renamed from: m */
    private final void m41527m() {
        LinearLayout[] linearLayoutArr = this.f32371i;
        if (linearLayoutArr != null) {
            int length = linearLayoutArr.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    LinearLayout[] linearLayoutArr2 = this.f32371i;
                    if (linearLayoutArr2 != null) {
                        linearLayoutArr2[i].setOnClickListener(new C7329b(i, this));
                        if (i2 > length) {
                            break;
                        }
                        i = i2;
                    } else {
                        C8594l.m46783q("lls");
                        throw null;
                    }
                }
            }
            TextView textView = this.f32375m;
            if (textView != null) {
                textView.setOnClickListener(new C7328a(this));
                TextView textView2 = this.f32374l;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C7330c(this));
                } else {
                    C8594l.m46783q("dialogCancel");
                    throw null;
                }
            } else {
                C8594l.m46783q("dialogOk");
                throw null;
            }
        } else {
            C8594l.m46783q("lls");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m41528n(int i, C7344h hVar, View view) {
        C8594l.m46771e(hVar, "this$0");
        if (i == 6) {
            C4604d.m20043b(hVar.getContext(), new C7331d(hVar, i));
        } else {
            hVar.m41526l(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m41529o(C7344h hVar, int i, long j) {
        C8594l.m46771e(hVar, "this$0");
        f32368t = j;
        hVar.m41526l(i);
        C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> qVar = hVar.f32378p;
        if (qVar != null) {
            Integer valueOf = Integer.valueOf(hVar.f32376n);
            Long valueOf2 = Long.valueOf(f32368t);
            CheckBox checkBox = hVar.f32373k;
            if (checkBox != null) {
                qVar.invoke(valueOf, valueOf2, new C8446k(Boolean.valueOf(checkBox.isChecked()), Boolean.FALSE));
            } else {
                C8594l.m46783q("cbOverToStop");
                throw null;
            }
        }
        hVar.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m41530p(C7344h hVar, View view) {
        C8594l.m46771e(hVar, "this$0");
        C8575q<? super Integer, ? super Long, ? super C8446k<Boolean, Boolean>, C8457t> qVar = hVar.f32378p;
        if (qVar != null) {
            Integer valueOf = Integer.valueOf(hVar.f32376n);
            Long valueOf2 = Long.valueOf(f32368t);
            CheckBox checkBox = hVar.f32373k;
            if (checkBox != null) {
                qVar.invoke(valueOf, valueOf2, new C8446k(Boolean.valueOf(checkBox.isChecked()), Boolean.FALSE));
            } else {
                C8594l.m46783q("cbOverToStop");
                throw null;
            }
        }
        hVar.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m41531q(C7344h hVar, View view) {
        C8594l.m46771e(hVar, "this$0");
        hVar.dismiss();
    }

    /* renamed from: b */
    public final TextView mo28084b() {
        TextView textView = this.f32380r;
        if (textView != null) {
            return textView;
        }
        C8594l.m46783q("customText");
        throw null;
    }

    /* renamed from: j */
    public final void mo28085j(TextView textView) {
        C8594l.m46771e(textView, "<set-?>");
        this.f32380r = textView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m41519d();
        m41518c();
        m41527m();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: r */
    public final void mo28087r(long j) {
        TextView textView = this.f32372j;
        if (textView != null) {
            textView.setText(C8594l.m46777k(C7398k.f32508a.mo28206b(j), getContext().getResources().getString(C8353g.sleep_timer_time_tip2)));
        } else {
            C8594l.m46783q("timerSleepTimeTip");
            throw null;
        }
    }
}
