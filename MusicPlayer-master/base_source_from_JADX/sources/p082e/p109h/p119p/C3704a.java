package p082e.p109h.p119p;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p082e.p109h.C3617d;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3741d;

/* renamed from: e.h.p.a */
/* compiled from: AccessibilityDelegateCompat */
public class C3704a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f11718c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f11719a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f11720b;

    /* renamed from: e.h.p.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C3705a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C3704a f11721a;

        C3705a(C3704a aVar) {
            this.f11721a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f11721a.mo3553a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3741d b = this.f11721a.mo5406b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo13165e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11721a.mo3426f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3736c I0 = C3736c.m15976I0(accessibilityNodeInfo);
            I0.mo13151x0(C3774v.m16184W(view));
            I0.mo13131m0(C3774v.m16179R(view));
            I0.mo13142s0(C3774v.m16218p(view));
            I0.mo13087D0(C3774v.m16167J(view));
            this.f11721a.mo3427g(view, I0);
            I0.mo13119f(accessibilityNodeInfo.getText(), view);
            List<C3736c.C3737a> c = C3704a.m15831c(view);
            for (int i = 0; i < c.size(); i++) {
                I0.mo13111b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11721a.mo5407h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f11721a.mo3554i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f11721a.mo3428j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f11721a.mo5408l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f11721a.mo5409m(view, accessibilityEvent);
        }
    }

    public C3704a() {
        this(f11718c);
    }

    /* renamed from: c */
    static List<C3736c.C3737a> m15831c(View view) {
        List<C3736c.C3737a> list = (List) view.getTag(C3617d.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m15832e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C3736c.m15987q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m15833k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C3617d.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m15832e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo3553a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f11719a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C3741d mo5406b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f11719a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C3741d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo13000d() {
        return this.f11720b;
    }

    /* renamed from: f */
    public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
        this.f11719a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3427g(View view, C3736c cVar) {
        this.f11719a.onInitializeAccessibilityNodeInfo(view, cVar.mo13095H0());
    }

    /* renamed from: h */
    public void mo5407h(View view, AccessibilityEvent accessibilityEvent) {
        this.f11719a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3554i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f11719a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3428j(View view, int i, Bundle bundle) {
        List<C3736c.C3737a> c = m15831c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C3736c.C3737a aVar = c.get(i2);
            if (aVar.mo13156b() == i) {
                z = aVar.mo13158d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f11719a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C3617d.accessibility_action_clickable_span) ? z : m15833k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo5408l(View view, int i) {
        this.f11719a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo5409m(View view, AccessibilityEvent accessibilityEvent) {
        this.f11719a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C3704a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f11719a = accessibilityDelegate;
        this.f11720b = new C3705a(this);
    }
}
