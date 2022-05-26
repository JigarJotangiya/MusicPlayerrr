package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p117n.C3683c;
import p082e.p109h.p118o.C3703i;

/* renamed from: androidx.core.widget.l */
/* compiled from: TextViewCompat */
public final class C0556l {

    /* renamed from: a */
    private static Field f2825a;

    /* renamed from: b */
    private static boolean f2826b;

    /* renamed from: c */
    private static Field f2827c;

    /* renamed from: d */
    private static boolean f2828d;

    /* renamed from: androidx.core.widget.l$a */
    /* compiled from: TextViewCompat */
    private static class C0557a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2829a;

        /* renamed from: b */
        private final TextView f2830b;

        /* renamed from: c */
        private Class<?> f2831c;

        /* renamed from: d */
        private Method f2832d;

        /* renamed from: e */
        private boolean f2833e;

        /* renamed from: f */
        private boolean f2834f = false;

        C0557a(ActionMode.Callback callback, TextView textView) {
            this.f2829a = callback;
            this.f2830b = textView;
        }

        /* renamed from: a */
        private Intent m3438a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m3439b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m3438a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3441d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m3440c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m3438a(), 0)) {
                if (m3442e(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m3441d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m3442e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        private void m3443f(Menu menu) {
            Method method;
            Context context = this.f2830b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2834f) {
                this.f2834f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2831c = cls;
                    this.f2832d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2833e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2831c = null;
                    this.f2832d = null;
                    this.f2833e = false;
                }
            }
            try {
                if (!this.f2833e || !this.f2831c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2832d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = m3440c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3439b(resolveInfo, this.f2830b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2829a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2829a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2829a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3443f(menu);
            return this.f2829a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m3419a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m3420b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m3421c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m3422d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f2828d) {
            f2827c = m3426h("mMaxMode");
            f2828d = true;
        }
        Field field = f2827c;
        if (field == null || m3427i(field, textView) != 1) {
            return -1;
        }
        if (!f2826b) {
            f2825a = m3426h("mMaximum");
            f2826b = true;
        }
        Field field2 = f2825a;
        if (field2 != null) {
            return m3427i(field2, textView);
        }
        return -1;
    }

    /* renamed from: e */
    private static int m3423e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m3424f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: g */
    public static C3683c.C3684a m3425g(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C3683c.C3684a(textView.getTextMetricsParams());
        }
        C3683c.C3684a.C3685a aVar = new C3683c.C3684a.C3685a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            aVar.mo12988b(textView.getBreakStrategy());
            aVar.mo12989c(textView.getHyphenationFrequency());
        }
        if (i >= 18) {
            aVar.mo12990d(m3424f(textView));
        }
        return aVar.mo12987a();
    }

    /* renamed from: h */
    private static Field m3426h(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: i */
    private static int m3427i(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: j */
    public static void m3428j(TextView textView, ColorStateList colorStateList) {
        C3703i.m15827d(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof C0559n) {
            ((C0559n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: k */
    public static void m3429k(TextView textView, PorterDuff.Mode mode) {
        C3703i.m15827d(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof C0559n) {
            ((C0559n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: l */
    public static void m3430l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: m */
    public static void m3431m(TextView textView, int i) {
        int i2;
        C3703i.m15826c(i);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i3 < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: n */
    public static void m3432n(TextView textView, int i) {
        int i2;
        C3703i.m15826c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: o */
    public static void m3433o(TextView textView, int i) {
        C3703i.m15826c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: p */
    public static void m3434p(TextView textView, C3683c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(cVar.mo12967b());
        } else if (m3425g(textView).mo12979a(cVar.mo12966a())) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: q */
    public static void m3435q(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: r */
    public static void m3436r(TextView textView, C3683c.C3684a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setTextDirection(m3423e(aVar.mo12982d()));
        }
        if (i < 23) {
            float textScaleX = aVar.mo12983e().getTextScaleX();
            textView.getPaint().set(aVar.mo12983e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo12983e());
        textView.setBreakStrategy(aVar.mo12980b());
        textView.setHyphenationFrequency(aVar.mo12981c());
    }

    /* renamed from: s */
    public static ActionMode.Callback m3437s(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0557a) || callback == null) ? callback : new C0557a(callback, textView);
    }
}
