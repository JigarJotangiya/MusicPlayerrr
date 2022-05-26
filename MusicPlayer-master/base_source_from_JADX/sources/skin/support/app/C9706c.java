package skin.support.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p082e.p098e.C3465a;
import p082e.p109h.p119p.C3774v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: skin.support.app.c */
/* compiled from: SkinCompatViewInflater */
public class C9706c {

    /* renamed from: b */
    private static final Class<?>[] f36744b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f36745c = {16843375};

    /* renamed from: d */
    private static final String[] f36746d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final Map<String, Constructor<? extends View>> f36747e = new C3465a();

    /* renamed from: a */
    private final Object[] f36748a = new Object[2];

    /* renamed from: skin.support.app.c$a */
    /* compiled from: SkinCompatViewInflater */
    private static class C9707a implements View.OnClickListener {

        /* renamed from: g */
        private final View f36749g;

        /* renamed from: h */
        private final String f36750h;

        /* renamed from: i */
        private Method f36751i;

        /* renamed from: j */
        private Context f36752j;

        public C9707a(View view, String str) {
            this.f36749g = view;
            this.f36750h = str;
        }

        /* renamed from: a */
        private void m50249a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f36750h, new Class[]{View.class})) != null) {
                        this.f36751i = method;
                        this.f36752j = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f36749g.getId();
            if (id == -1) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = " with id '" + this.f36749g.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f36750h + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f36749g.getClass() + str2);
        }

        public void onClick(View view) {
            if (this.f36751i == null) {
                m50249a(this.f36749g.getContext(), this.f36750h);
            }
            try {
                this.f36751i.invoke(this.f36752j, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m50243a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C3774v.m16176O(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36745c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C9707a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private View m50244b(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Map<String, Constructor<? extends View>> map = f36747e;
        Constructor<? extends U> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f36744b);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f36748a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000d A[LOOP:0: B:1:0x000d->B:4:0x001d, LOOP_START, PHI: r1 
      PHI: (r1v1 android.view.View) = (r1v0 android.view.View), (r1v5 android.view.View) binds: [B:0:0x0000, B:4:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m50245d(android.content.Context r4, java.lang.String r5, android.util.AttributeSet r6) {
        /*
            r3 = this;
            m.a.b r0 = p443m.p444a.C9317b.m49321m()
            java.util.List r0 = r0.mo32274k()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            skin.support.app.d r1 = (skin.support.app.C9708d) r1
            android.view.View r1 = r1.mo33832a(r4, r5, r6)
            if (r1 != 0) goto L_0x0020
            goto L_0x000d
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.app.C9706c.m50245d(android.content.Context, java.lang.String, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000d A[LOOP:0: B:1:0x000d->B:4:0x001d, LOOP_START, PHI: r1 
      PHI: (r1v1 android.view.View) = (r1v0 android.view.View), (r1v5 android.view.View) binds: [B:0:0x0000, B:4:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m50246e(android.content.Context r4, java.lang.String r5, android.util.AttributeSet r6) {
        /*
            r3 = this;
            m.a.b r0 = p443m.p444a.C9317b.m49321m()
            java.util.List r0 = r0.mo32275l()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            skin.support.app.d r1 = (skin.support.app.C9708d) r1
            android.view.View r1 = r1.mo33832a(r4, r5, r6)
            if (r1 != 0) goto L_0x0020
            goto L_0x000d
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.app.C9706c.m50246e(android.content.Context, java.lang.String, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: c */
    public final View mo33829c(View view, String str, Context context, AttributeSet attributeSet) {
        View d = m50245d(context, str, attributeSet);
        if (d == null) {
            d = m50246e(context, str, attributeSet);
        }
        if (d == null) {
            d = mo33830f(context, str, attributeSet);
        }
        if (d != null) {
            m50243a(d, attributeSet);
        }
        return d;
    }

    /* renamed from: f */
    public View mo33830f(Context context, String str, AttributeSet attributeSet) {
        if ("view".equals(str)) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f36748a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f36746d;
                    if (i < strArr.length) {
                        View b = m50244b(context, str, strArr[i]);
                        if (b != null) {
                            return b;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f36748a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View b2 = m50244b(context, str, (String) null);
                Object[] objArr3 = this.f36748a;
                objArr3[0] = null;
                objArr3[1] = null;
                return b2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f36748a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }
}
