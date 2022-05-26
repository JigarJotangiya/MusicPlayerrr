package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.b */
/* compiled from: ActionBarDrawerToggleHoneycomb */
class C0131b {

    /* renamed from: a */
    private static final int[] f463a = {16843531};

    /* renamed from: androidx.appcompat.app.b$a */
    /* compiled from: ActionBarDrawerToggleHoneycomb */
    static class C0132a {

        /* renamed from: a */
        public Method f464a;

        /* renamed from: b */
        public Method f465b;

        C0132a(Activity activity) {
            try {
                this.f464a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f465b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            ImageView imageView = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m698a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f463a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: b */
    public static C0132a m699b(C0132a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0132a(activity);
        }
        if (aVar.f464a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f465b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }
}
