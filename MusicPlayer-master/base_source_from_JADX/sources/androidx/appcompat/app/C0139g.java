package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0272d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082e.p083a.C3409j;
import p082e.p083a.p090o.C3435d;
import p082e.p098e.C3478g;
import p082e.p109h.p119p.C3774v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: AppCompatViewInflater */
public class C0139g {

    /* renamed from: b */
    private static final Class<?>[] f475b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f476c = {16843375};

    /* renamed from: d */
    private static final String[] f477d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C3478g<String, Constructor<? extends View>> f478e = new C3478g<>();

    /* renamed from: a */
    private final Object[] f479a = new Object[2];

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatViewInflater */
    private static class C0140a implements View.OnClickListener {

        /* renamed from: g */
        private final View f480g;

        /* renamed from: h */
        private final String f481h;

        /* renamed from: i */
        private Method f482i;

        /* renamed from: j */
        private Context f483j;

        public C0140a(View view, String str) {
            this.f480g = view;
            this.f481h = str;
        }

        /* renamed from: a */
        private void m787a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f481h, new Class[]{View.class})) != null) {
                        this.f482i = method;
                        this.f483j = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f480g.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f480g.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f481h + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f480g.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f482i == null) {
                m787a(this.f480g.getContext());
            }
            try {
                this.f482i.invoke(this.f483j, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m766a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C3774v.m16176O(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f476c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0140a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m767r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C3478g<String, Constructor<? extends View>> gVar = f478e;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f475b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f479a);
    }

    /* renamed from: s */
    private View m768s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f479a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f477d;
                    if (i < strArr.length) {
                        View r = m767r(context, str, strArr[i]);
                        if (r != null) {
                            return r;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f479a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r2 = m767r(context, str, (String) null);
                Object[] objArr3 = this.f479a;
                objArr3[0] = null;
                objArr3[1] = null;
                return r2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f479a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m769t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C3409j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C3409j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C3435d) || ((C3435d) context).mo12170c() != resourceId) ? new C3435d(context, resourceId) : context;
        }
        return context;
    }

    /* renamed from: u */
    private void m770u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatAutoCompleteTextView mo663b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo664c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo665d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatCheckedTextView mo666e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatEditText mo667f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageButton mo668g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatImageView mo669h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatMultiAutoCompleteTextView mo670i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRadioButton mo671j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatRatingBar mo672k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatSeekBar mo673l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSpinner mo674m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo675n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatToggleButton mo676o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public View mo677p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final View mo678q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m769t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0272d0.m1593b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo672k(context2, attributeSet);
                m770u(view2, str);
                break;
            case 1:
                view2 = mo666e(context2, attributeSet);
                m770u(view2, str);
                break;
            case 2:
                view2 = mo670i(context2, attributeSet);
                m770u(view2, str);
                break;
            case 3:
                view2 = mo675n(context2, attributeSet);
                m770u(view2, str);
                break;
            case 4:
                view2 = mo668g(context2, attributeSet);
                m770u(view2, str);
                break;
            case 5:
                view2 = mo673l(context2, attributeSet);
                m770u(view2, str);
                break;
            case 6:
                view2 = mo674m(context2, attributeSet);
                m770u(view2, str);
                break;
            case 7:
                view2 = mo671j(context2, attributeSet);
                m770u(view2, str);
                break;
            case 8:
                view2 = mo676o(context2, attributeSet);
                m770u(view2, str);
                break;
            case 9:
                view2 = mo669h(context2, attributeSet);
                m770u(view2, str);
                break;
            case 10:
                view2 = mo663b(context2, attributeSet);
                m770u(view2, str);
                break;
            case 11:
                view2 = mo665d(context2, attributeSet);
                m770u(view2, str);
                break;
            case 12:
                view2 = mo667f(context2, attributeSet);
                m770u(view2, str);
                break;
            case 13:
                view2 = mo664c(context2, attributeSet);
                m770u(view2, str);
                break;
            default:
                view2 = mo677p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m768s(context2, str, attributeSet);
        }
        if (view2 != null) {
            m766a(view2, attributeSet);
        }
        return view2;
    }
}