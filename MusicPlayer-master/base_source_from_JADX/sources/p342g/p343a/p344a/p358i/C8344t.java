package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.t */
/* compiled from: ToastUtils */
public class C8344t {

    /* renamed from: a */
    private static Toast f34790a;

    /* renamed from: b */
    private static View f34791b;

    /* renamed from: a */
    private static void m46313a(Context context) {
        if (f34790a == null) {
            f34790a = new Toast(context);
        }
        if (f34791b == null) {
            f34791b = Toast.makeText(context, BuildConfig.FLAVOR, 0).getView();
        }
        f34790a.setView(f34791b);
    }

    /* renamed from: b */
    public static void m46314b(Context context, int i) {
        m46318f(context.getApplicationContext(), i, 1);
    }

    /* renamed from: c */
    public static void m46315c(Context context, CharSequence charSequence) {
        m46319g(context.getApplicationContext(), charSequence, 0);
    }

    /* renamed from: d */
    public static void m46316d(Context context, int i) {
        m46318f(context.getApplicationContext(), i, 0);
    }

    /* renamed from: e */
    public static void m46317e(Context context, CharSequence charSequence) {
        m46319g(context.getApplicationContext(), charSequence, 0);
    }

    /* renamed from: f */
    private static void m46318f(Context context, int i, int i2) {
        if (i != 0) {
            try {
                m46313a(context);
                f34790a.setText(i);
                f34790a.setDuration(i2);
                f34790a.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private static void m46319g(Context context, CharSequence charSequence, int i) {
        try {
            m46313a(context);
            f34790a.setText(charSequence);
            f34790a.setDuration(i);
            f34790a.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
