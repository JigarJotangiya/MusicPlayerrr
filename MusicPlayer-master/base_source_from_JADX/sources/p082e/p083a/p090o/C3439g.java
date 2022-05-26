package p082e.p083a.p090o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0177j;
import androidx.appcompat.widget.C0279g0;
import androidx.appcompat.widget.C0303p;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p083a.C3409j;
import p082e.p109h.p111i.p112a.C3638a;
import p082e.p109h.p119p.C3707b;
import p082e.p109h.p119p.C3761i;

/* renamed from: e.a.o.g */
/* compiled from: SupportMenuInflater */
public class C3439g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f10918e;

    /* renamed from: f */
    static final Class<?>[] f10919f;

    /* renamed from: a */
    final Object[] f10920a;

    /* renamed from: b */
    final Object[] f10921b;

    /* renamed from: c */
    Context f10922c;

    /* renamed from: d */
    private Object f10923d;

    /* renamed from: e.a.o.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C3440a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f10924c = {MenuItem.class};

        /* renamed from: a */
        private Object f10925a;

        /* renamed from: b */
        private Method f10926b;

        public C3440a(Object obj, String str) {
            this.f10925a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10926b = cls.getMethod(str, f10924c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10926b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10926b.invoke(this.f10925a, new Object[]{menuItem})).booleanValue();
                }
                this.f10926b.invoke(this.f10925a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: e.a.o.g$b */
    /* compiled from: SupportMenuInflater */
    private class C3441b {

        /* renamed from: A */
        C3707b f10927A;

        /* renamed from: B */
        private CharSequence f10928B;

        /* renamed from: C */
        private CharSequence f10929C;

        /* renamed from: D */
        private ColorStateList f10930D = null;

        /* renamed from: E */
        private PorterDuff.Mode f10931E = null;

        /* renamed from: a */
        private Menu f10933a;

        /* renamed from: b */
        private int f10934b;

        /* renamed from: c */
        private int f10935c;

        /* renamed from: d */
        private int f10936d;

        /* renamed from: e */
        private int f10937e;

        /* renamed from: f */
        private boolean f10938f;

        /* renamed from: g */
        private boolean f10939g;

        /* renamed from: h */
        private boolean f10940h;

        /* renamed from: i */
        private int f10941i;

        /* renamed from: j */
        private int f10942j;

        /* renamed from: k */
        private CharSequence f10943k;

        /* renamed from: l */
        private CharSequence f10944l;

        /* renamed from: m */
        private int f10945m;

        /* renamed from: n */
        private char f10946n;

        /* renamed from: o */
        private int f10947o;

        /* renamed from: p */
        private char f10948p;

        /* renamed from: q */
        private int f10949q;

        /* renamed from: r */
        private int f10950r;

        /* renamed from: s */
        private boolean f10951s;

        /* renamed from: t */
        private boolean f10952t;

        /* renamed from: u */
        private boolean f10953u;

        /* renamed from: v */
        private int f10954v;

        /* renamed from: w */
        private int f10955w;

        /* renamed from: x */
        private String f10956x;

        /* renamed from: y */
        private String f10957y;

        /* renamed from: z */
        private String f10958z;

        public C3441b(Menu menu) {
            this.f10933a = menu;
            mo12203h();
        }

        /* renamed from: c */
        private char m14696c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m14697e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C3439g.this.f10922c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m14698i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f10951s).setVisible(this.f10952t).setEnabled(this.f10953u).setCheckable(this.f10950r >= 1).setTitleCondensed(this.f10944l).setIcon(this.f10945m);
            int i = this.f10954v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f10958z != null) {
                if (!C3439g.this.f10922c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C3440a(C3439g.this.mo12195b(), this.f10958z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f10950r >= 2) {
                if (menuItem instanceof C0175i) {
                    ((C0175i) menuItem).mo1013t(true);
                } else if (menuItem instanceof C0177j) {
                    ((C0177j) menuItem).mo1043h(true);
                }
            }
            String str = this.f10956x;
            if (str != null) {
                menuItem.setActionView((View) m14697e(str, C3439g.f10918e, C3439g.this.f10920a));
                z = true;
            }
            int i2 = this.f10955w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C3707b bVar = this.f10927A;
            if (bVar != null) {
                C3761i.m16098a(menuItem, bVar);
            }
            C3761i.m16100c(menuItem, this.f10928B);
            C3761i.m16104g(menuItem, this.f10929C);
            C3761i.m16099b(menuItem, this.f10946n, this.f10947o);
            C3761i.m16103f(menuItem, this.f10948p, this.f10949q);
            PorterDuff.Mode mode = this.f10931E;
            if (mode != null) {
                C3761i.m16102e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f10930D;
            if (colorStateList != null) {
                C3761i.m16101d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo12198a() {
            this.f10940h = true;
            m14698i(this.f10933a.add(this.f10934b, this.f10941i, this.f10942j, this.f10943k));
        }

        /* renamed from: b */
        public SubMenu mo12199b() {
            this.f10940h = true;
            SubMenu addSubMenu = this.f10933a.addSubMenu(this.f10934b, this.f10941i, this.f10942j, this.f10943k);
            m14698i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo12200d() {
            return this.f10940h;
        }

        /* renamed from: f */
        public void mo12201f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3439g.this.f10922c.obtainStyledAttributes(attributeSet, C3409j.MenuGroup);
            this.f10934b = obtainStyledAttributes.getResourceId(C3409j.MenuGroup_android_id, 0);
            this.f10935c = obtainStyledAttributes.getInt(C3409j.MenuGroup_android_menuCategory, 0);
            this.f10936d = obtainStyledAttributes.getInt(C3409j.MenuGroup_android_orderInCategory, 0);
            this.f10937e = obtainStyledAttributes.getInt(C3409j.MenuGroup_android_checkableBehavior, 0);
            this.f10938f = obtainStyledAttributes.getBoolean(C3409j.MenuGroup_android_visible, true);
            this.f10939g = obtainStyledAttributes.getBoolean(C3409j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo12202g(AttributeSet attributeSet) {
            C0279g0 u = C0279g0.m1626u(C3439g.this.f10922c, attributeSet, C3409j.MenuItem);
            this.f10941i = u.mo1989n(C3409j.MenuItem_android_id, 0);
            this.f10942j = (u.mo1986k(C3409j.MenuItem_android_menuCategory, this.f10935c) & -65536) | (u.mo1986k(C3409j.MenuItem_android_orderInCategory, this.f10936d) & 65535);
            this.f10943k = u.mo1991p(C3409j.MenuItem_android_title);
            this.f10944l = u.mo1991p(C3409j.MenuItem_android_titleCondensed);
            this.f10945m = u.mo1989n(C3409j.MenuItem_android_icon, 0);
            this.f10946n = m14696c(u.mo1990o(C3409j.MenuItem_android_alphabeticShortcut));
            this.f10947o = u.mo1986k(C3409j.MenuItem_alphabeticModifiers, 4096);
            this.f10948p = m14696c(u.mo1990o(C3409j.MenuItem_android_numericShortcut));
            this.f10949q = u.mo1986k(C3409j.MenuItem_numericModifiers, 4096);
            int i = C3409j.MenuItem_android_checkable;
            if (u.mo1994s(i)) {
                this.f10950r = u.mo1976a(i, false) ? 1 : 0;
            } else {
                this.f10950r = this.f10937e;
            }
            this.f10951s = u.mo1976a(C3409j.MenuItem_android_checked, false);
            this.f10952t = u.mo1976a(C3409j.MenuItem_android_visible, this.f10938f);
            this.f10953u = u.mo1976a(C3409j.MenuItem_android_enabled, this.f10939g);
            this.f10954v = u.mo1986k(C3409j.MenuItem_showAsAction, -1);
            this.f10958z = u.mo1990o(C3409j.MenuItem_android_onClick);
            this.f10955w = u.mo1989n(C3409j.MenuItem_actionLayout, 0);
            this.f10956x = u.mo1990o(C3409j.MenuItem_actionViewClass);
            String o = u.mo1990o(C3409j.MenuItem_actionProviderClass);
            this.f10957y = o;
            boolean z = o != null;
            if (z && this.f10955w == 0 && this.f10956x == null) {
                this.f10927A = (C3707b) m14697e(o, C3439g.f10919f, C3439g.this.f10921b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f10927A = null;
            }
            this.f10928B = u.mo1991p(C3409j.MenuItem_contentDescription);
            this.f10929C = u.mo1991p(C3409j.MenuItem_tooltipText);
            int i2 = C3409j.MenuItem_iconTintMode;
            if (u.mo1994s(i2)) {
                this.f10931E = C0303p.m1832e(u.mo1986k(i2, -1), this.f10931E);
            } else {
                this.f10931E = null;
            }
            int i3 = C3409j.MenuItem_iconTint;
            if (u.mo1994s(i3)) {
                this.f10930D = u.mo1978c(i3);
            } else {
                this.f10930D = null;
            }
            u.mo1995w();
            this.f10940h = false;
        }

        /* renamed from: h */
        public void mo12203h() {
            this.f10934b = 0;
            this.f10935c = 0;
            this.f10936d = 0;
            this.f10937e = 0;
            this.f10938f = true;
            this.f10939g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f10918e = r0
            f10919f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p083a.p090o.C3439g.<clinit>():void");
    }

    public C3439g(Context context) {
        super(context);
        this.f10922c = context;
        Object[] objArr = {context};
        this.f10920a = objArr;
        this.f10921b = objArr;
    }

    /* renamed from: a */
    private Object m14693a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m14693a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m14694c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C3441b bVar = new C3441b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo12203h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo12200d()) {
                                C3707b bVar2 = bVar.f10927A;
                                if (bVar2 == null || !bVar2.mo1077a()) {
                                    bVar.mo12198a();
                                } else {
                                    bVar.mo12199b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo12201f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo12202g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m14694c(xmlPullParser, attributeSet, bVar.mo12199b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo12195b() {
        if (this.f10923d == null) {
            this.f10923d = m14693a(this.f10922c);
        }
        return this.f10923d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C3638a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f10922c.getResources().getLayout(i);
            m14694c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
