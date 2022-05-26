package com.coocent.notification.permission.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.p003d.C0524f;
import java.util.HashMap;
import java.util.Objects;
import p159f.p166c.p210i.p211a.C4583a;
import p159f.p166c.p210i.p211a.C4584b;
import p159f.p166c.p210i.p211a.C4585c;
import p159f.p166c.p210i.p211a.C4586d;
import p159f.p166c.p210i.p211a.p212f.C4588a;
import p159f.p166c.p210i.p211a.p212f.C4589b;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* compiled from: NotificationPermissionDialogActivity.kt */
public final class NotificationPermissionDialogActivity extends AppCompatActivity {

    /* renamed from: E */
    public static final C2472a f8748E = new C2472a((C8589g) null);

    /* renamed from: A */
    private ValueAnimator f8749A;

    /* renamed from: B */
    private Drawable f8750B;

    /* renamed from: C */
    private float f8751C;

    /* renamed from: D */
    private HashMap f8752D;

    /* renamed from: z */
    private int f8753z = 61024;

    /* renamed from: com.coocent.notification.permission.activity.NotificationPermissionDialogActivity$a */
    /* compiled from: NotificationPermissionDialogActivity.kt */
    public static final class C2472a {
        private C2472a() {
        }

        /* renamed from: a */
        public final void mo9600a(Activity activity) {
            C8594l.m46771e(activity, "activity");
            activity.startActivityForResult(new Intent(activity, NotificationPermissionDialogActivity.class), 61024);
        }

        public /* synthetic */ C2472a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: com.coocent.notification.permission.activity.NotificationPermissionDialogActivity$b */
    /* compiled from: NotificationPermissionDialogActivity.kt */
    static final class C2473b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: g */
        final /* synthetic */ NotificationPermissionDialogActivity f8754g;

        C2473b(NotificationPermissionDialogActivity notificationPermissionDialogActivity) {
            this.f8754g = notificationPermissionDialogActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C4588a.m20013f(this.f8754g, z);
        }
    }

    /* renamed from: com.coocent.notification.permission.activity.NotificationPermissionDialogActivity$c */
    /* compiled from: NotificationPermissionDialogActivity.kt */
    static final class C2474c implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ NotificationPermissionDialogActivity f8755g;

        C2474c(NotificationPermissionDialogActivity notificationPermissionDialogActivity) {
            this.f8755g = notificationPermissionDialogActivity;
        }

        public final void onClick(View view) {
            C8594l.m46770d(view, "it");
            int id = view.getId();
            if (id == C4584b.tvAllow) {
                this.f8755g.m11609i2();
            } else if (id == C4584b.tvNoAllow) {
                this.f8755g.m11611l2();
            }
        }
    }

    /* renamed from: com.coocent.notification.permission.activity.NotificationPermissionDialogActivity$d */
    /* compiled from: NotificationPermissionDialogActivity.kt */
    public static final class C2475d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: g */
        final /* synthetic */ NotificationPermissionDialogActivity f8756g;

        /* renamed from: com.coocent.notification.permission.activity.NotificationPermissionDialogActivity$d$a */
        /* compiled from: NotificationPermissionDialogActivity.kt */
        static final class C2476a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C2475d f8757a;

            /* renamed from: b */
            final /* synthetic */ float f8758b;

            C2476a(C2475d dVar, float f) {
                this.f8757a = dVar;
                this.f8758b = f;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NotificationPermissionDialogActivity notificationPermissionDialogActivity = this.f8757a.f8756g;
                C8594l.m46770d(valueAnimator, "it");
                notificationPermissionDialogActivity.m11614o2(valueAnimator, this.f8758b);
            }
        }

        C2475d(NotificationPermissionDialogActivity notificationPermissionDialogActivity) {
            this.f8756g = notificationPermissionDialogActivity;
        }

        public void onGlobalLayout() {
            NotificationPermissionDialogActivity notificationPermissionDialogActivity = this.f8756g;
            int i = C4584b.ivAllowHand;
            ImageView imageView = (ImageView) notificationPermissionDialogActivity.mo9597d2(i);
            C8594l.m46770d(imageView, "ivAllowHand");
            imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f8756g.mo9598k2().setDuration(1200);
            ImageView imageView2 = (ImageView) this.f8756g.mo9597d2(i);
            C8594l.m46770d(imageView2, "ivAllowHand");
            float x = imageView2.getX();
            this.f8756g.mo9598k2().setRepeatCount(-1);
            this.f8756g.mo9598k2().addUpdateListener(new C2476a(this, x));
            this.f8756g.mo9598k2().start();
        }
    }

    public NotificationPermissionDialogActivity() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 40.0f});
        C8594l.m46770d(ofFloat, "ValueAnimator.ofFloat(0f, 40f)");
        this.f8749A = ofFloat;
        this.f8751C = -1.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m11609i2() {
        C4588a.m20014g(this, this, this.f8753z);
        finish();
    }

    /* renamed from: j2 */
    private final void m11610j2() {
        this.f8753z = getIntent().getIntExtra("requestCode", 61024);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m11611l2() {
        finish();
    }

    /* renamed from: m2 */
    private final void m11612m2() {
        int i = C4584b.ivAllow;
        int i2 = C4586d.pop_up_allowed_close1;
        ((ImageView) mo9597d2(i)).setImageResource(i2);
        ImageView imageView = (ImageView) mo9597d2(i);
        C8594l.m46770d(imageView, "ivAllow");
        imageView.setTag(String.valueOf(i2));
    }

    /* renamed from: n2 */
    private final void m11613n2() {
        if (this.f8750B != null) {
            ((ImageView) mo9597d2(C4584b.ivAllow)).setImageDrawable(this.f8750B);
        } else {
            ((ImageView) mo9597d2(C4584b.ivAllow)).setImageResource(C4586d.pop_up_allowed_open1);
        }
        ImageView imageView = (ImageView) mo9597d2(C4584b.ivAllow);
        C8594l.m46770d(imageView, "ivAllow");
        imageView.setTag(String.valueOf(C4586d.pop_up_allowed_open1));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m11614o2(ValueAnimator valueAnimator, float f) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (this.f8751C != floatValue) {
            this.f8751C = floatValue;
            ImageView imageView = (ImageView) mo9597d2(C4584b.ivAllowHand);
            C8594l.m46770d(imageView, "ivAllowHand");
            imageView.setX(f + floatValue);
            if (floatValue > ((float) 30)) {
                ImageView imageView2 = (ImageView) mo9597d2(C4584b.ivAllow);
                C8594l.m46770d(imageView2, "ivAllow");
                if (!imageView2.getTag().equals(String.valueOf(C4586d.pop_up_allowed_open1))) {
                    m11613n2();
                    return;
                }
            }
            if (floatValue < ((float) 1)) {
                ImageView imageView3 = (ImageView) mo9597d2(C4584b.ivAllow);
                C8594l.m46770d(imageView3, "ivAllow");
                if (!imageView3.getTag().equals(String.valueOf(C4586d.pop_up_allowed_close1))) {
                    m11612m2();
                }
            }
        }
    }

    /* renamed from: p2 */
    private final void m11615p2() {
        Drawable f = C0524f.m3225f(getResources(), C4586d.pop_up_allowed_open1, (Resources.Theme) null);
        this.f8750B = f;
        if (f != null) {
            C4589b bVar = C4589b.f13299a;
            Context applicationContext = getApplicationContext();
            C8594l.m46770d(applicationContext, "applicationContext");
            this.f8750B = bVar.mo15334a(applicationContext, f, C4583a.colorAccent);
        }
        m11612m2();
    }

    /* renamed from: q2 */
    private final void m11616q2() {
        C2474c cVar = new C2474c(this);
        ((TextView) mo9597d2(C4584b.tvAllow)).setOnClickListener(cVar);
        ((TextView) mo9597d2(C4584b.tvNoAllow)).setOnClickListener(cVar);
        ((AppCompatCheckBox) mo9597d2(C4584b.cbNoMore)).setOnCheckedChangeListener(new C2473b(this));
    }

    /* renamed from: r2 */
    private final void m11617r2() {
        mo483b2(1);
        C4588a.m20015h(this);
        setFinishOnTouchOutside(true);
    }

    /* renamed from: s2 */
    private final void m11618s2() {
        ImageView imageView = (ImageView) mo9597d2(C4584b.ivAllowHand);
        C8594l.m46770d(imageView, "ivAllowHand");
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new C2475d(this));
    }

    /* renamed from: d2 */
    public View mo9597d2(int i) {
        if (this.f8752D == null) {
            this.f8752D = new HashMap();
        }
        View view = (View) this.f8752D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f8752D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: k2 */
    public final ValueAnimator mo9598k2() {
        return this.f8749A;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        C8594l.m46770d(window, "window");
        View decorView = window.getDecorView();
        C8594l.m46770d(decorView, "window.decorView");
        ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.gravity = 49;
        Object systemService = getApplicationContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        layoutParams2.y = point.y / 4;
        layoutParams2.width = (int) (((float) point.x) * 0.85f);
        windowManager.updateViewLayout(decorView, layoutParams2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11617r2();
        setContentView(C4585c.activity_dialog_notification_permission);
        m11610j2();
        m11615p2();
        m11616q2();
        m11618s2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            this.f8749A.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
