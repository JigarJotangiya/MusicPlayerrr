package p082e.p109h.p119p.p120e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.h.p.e0.d */
/* compiled from: AccessibilityNodeProviderCompat */
public class C3741d {

    /* renamed from: a */
    private final Object f11810a;

    /* renamed from: e.h.p.e0.d$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C3742a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C3741d f11811a;

        C3742a(C3741d dVar) {
            this.f11811a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3736c b = this.f11811a.mo13162b(i);
            if (b == null) {
                return null;
            }
            return b.mo13095H0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C3736c> c = this.f11811a.mo13163c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo13095H0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f11811a.mo13166f(i, i2, bundle);
        }
    }

    /* renamed from: e.h.p.e0.d$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C3743b extends C3742a {
        C3743b(C3741d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C3736c d = this.f11811a.mo13164d(i);
            if (d == null) {
                return null;
            }
            return d.mo13095H0();
        }
    }

    /* renamed from: e.h.p.e0.d$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C3744c extends C3743b {
        C3744c(C3741d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f11811a.mo13161a(i, C3736c.m15976I0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C3741d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f11810a = new C3744c(this);
        } else if (i >= 19) {
            this.f11810a = new C3743b(this);
        } else if (i >= 16) {
            this.f11810a = new C3742a(this);
        } else {
            this.f11810a = null;
        }
    }

    /* renamed from: a */
    public void mo13161a(int i, C3736c cVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C3736c mo13162b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C3736c> mo13163c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C3736c mo13164d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo13165e() {
        return this.f11810a;
    }

    /* renamed from: f */
    public boolean mo13166f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C3741d(Object obj) {
        this.f11810a = obj;
    }
}
