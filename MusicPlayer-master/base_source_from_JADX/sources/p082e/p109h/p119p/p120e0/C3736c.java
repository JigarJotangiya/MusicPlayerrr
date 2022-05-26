package p082e.p109h.p119p.p120e0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p082e.p109h.C3617d;
import p082e.p109h.p115l.C3643a;
import p082e.p109h.p119p.p120e0.C3746f;

/* renamed from: e.h.p.e0.c */
/* compiled from: AccessibilityNodeInfoCompat */
public class C3736c {

    /* renamed from: d */
    private static int f11788d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f11789a;

    /* renamed from: b */
    public int f11790b = -1;

    /* renamed from: c */
    private int f11791c = -1;

    /* renamed from: e.h.p.e0.c$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3737a {

        /* renamed from: e */
        public static final C3737a f11792e = new C3737a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C3737a f11793f = new C3737a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C3737a f11794g = new C3737a(16, (CharSequence) null);

        /* renamed from: h */
        public static final C3737a f11795h = new C3737a(4096, (CharSequence) null);

        /* renamed from: i */
        public static final C3737a f11796i = new C3737a(8192, (CharSequence) null);

        /* renamed from: j */
        public static final C3737a f11797j = new C3737a(262144, (CharSequence) null);

        /* renamed from: k */
        public static final C3737a f11798k = new C3737a(524288, (CharSequence) null);

        /* renamed from: l */
        public static final C3737a f11799l = new C3737a(1048576, (CharSequence) null);

        /* renamed from: m */
        public static final C3737a f11800m;

        /* renamed from: n */
        public static final C3737a f11801n;

        /* renamed from: o */
        public static final C3737a f11802o;

        /* renamed from: a */
        final Object f11803a;

        /* renamed from: b */
        private final int f11804b;

        /* renamed from: c */
        private final Class<? extends C3746f.C3747a> f11805c;

        /* renamed from: d */
        protected final C3746f f11806d;

        static {
            Class<C3746f.C3749c> cls = C3746f.C3749c.class;
            Class<C3746f.C3748b> cls2 = C3746f.C3748b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C3737a(4, (CharSequence) null);
            new C3737a(8, (CharSequence) null);
            new C3737a(32, (CharSequence) null);
            new C3737a(64, (CharSequence) null);
            new C3737a(128, (CharSequence) null);
            new C3737a(256, (CharSequence) null, (Class<? extends C3746f.C3747a>) cls2);
            new C3737a(512, (CharSequence) null, (Class<? extends C3746f.C3747a>) cls2);
            new C3737a(1024, (CharSequence) null, (Class<? extends C3746f.C3747a>) cls);
            new C3737a(2048, (CharSequence) null, (Class<? extends C3746f.C3747a>) cls);
            new C3737a(16384, (CharSequence) null);
            new C3737a(32768, (CharSequence) null);
            new C3737a(65536, (CharSequence) null);
            new C3737a(131072, (CharSequence) null, (Class<? extends C3746f.C3747a>) C3746f.C3753g.class);
            new C3737a(2097152, (CharSequence) null, (Class<? extends C3746f.C3747a>) C3746f.C3754h.class);
            int i = Build.VERSION.SDK_INT;
            new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C3746f) null, C3746f.C3751e.class);
            f11800m = new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            f11801n = new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            f11802o = new C3737a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C3746f) null, C3746f.C3752f.class);
            new C3737a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C3746f) null, C3746f.C3750d.class);
            new C3737a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            new C3737a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new C3737a(accessibilityAction, 16908372, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
        }

        public C3737a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
        }

        /* renamed from: a */
        public C3737a mo13155a(CharSequence charSequence, C3746f fVar) {
            return new C3737a((Object) null, this.f11804b, charSequence, fVar, this.f11805c);
        }

        /* renamed from: b */
        public int mo13156b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f11803a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo13157c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f11803a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo13158d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                e.h.p.e0.f r0 = r4.f11806d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends e.h.p.e0.f$a> r2 = r4.f11805c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                e.h.p.e0.f$a r1 = (p082e.p109h.p119p.p120e0.C3746f.C3747a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo13172a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends e.h.p.e0.f$a> r1 = r4.f11805c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                e.h.p.e0.f r6 = r4.f11806d
                boolean r5 = r6.mo6390a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p119p.p120e0.C3736c.C3737a.mo13158d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3737a)) {
                return false;
            }
            C3737a aVar = (C3737a) obj;
            Object obj2 = this.f11803a;
            if (obj2 == null) {
                if (aVar.f11803a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f11803a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f11803a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C3737a(int i, CharSequence charSequence, C3746f fVar) {
            this((Object) null, i, charSequence, fVar, (Class<? extends C3746f.C3747a>) null);
        }

        C3737a(Object obj) {
            this(obj, 0, (CharSequence) null, (C3746f) null, (Class<? extends C3746f.C3747a>) null);
        }

        private C3737a(int i, CharSequence charSequence, Class<? extends C3746f.C3747a> cls) {
            this((Object) null, i, charSequence, (C3746f) null, cls);
        }

        C3737a(Object obj, int i, CharSequence charSequence, C3746f fVar, Class<? extends C3746f.C3747a> cls) {
            this.f11804b = i;
            this.f11806d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f11803a = obj;
            } else {
                this.f11803a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f11805c = cls;
        }
    }

    /* renamed from: e.h.p.e0.c$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3738b {

        /* renamed from: a */
        final Object f11807a;

        C3738b(Object obj) {
            this.f11807a = obj;
        }

        /* renamed from: a */
        public static C3738b m16066a(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C3738b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C3738b((Object) null);
        }

        /* renamed from: b */
        public static C3738b m16067b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C3738b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C3738b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C3738b((Object) null);
        }
    }

    /* renamed from: e.h.p.e0.c$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3739c {

        /* renamed from: a */
        final Object f11808a;

        C3739c(Object obj) {
            this.f11808a = obj;
        }

        /* renamed from: a */
        public static C3739c m16068a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C3739c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C3739c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C3739c((Object) null);
        }
    }

    /* renamed from: e.h.p.e0.c$d */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C3740d {

        /* renamed from: a */
        final Object f11809a;

        C3740d(Object obj) {
            this.f11809a = obj;
        }

        /* renamed from: a */
        public static C3740d m16069a(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C3740d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new C3740d((Object) null);
        }
    }

    private C3736c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f11789a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private int m15975A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f11788d;
        f11788d = i2 + 1;
        return i2;
    }

    /* renamed from: I0 */
    public static C3736c m15976I0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3736c(accessibilityNodeInfo);
    }

    /* renamed from: O */
    public static C3736c m15977O() {
        return m15976I0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: P */
    public static C3736c m15978P(View view) {
        return m15976I0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: Q */
    public static C3736c m15979Q(C3736c cVar) {
        return m15976I0(AccessibilityNodeInfo.obtain(cVar.f11789a));
    }

    /* renamed from: U */
    private void m15980U(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m15989w(view);
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < w.size(); i++) {
                if (w.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                w.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: W */
    private void m15981W(int i, boolean z) {
        Bundle s = mo13141s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m15982e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m15983g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f11789a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f11789a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f11789a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m15984h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f11789a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f11789a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m15985j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m15986l(int i) {
        Bundle s = mo13141s();
        if (s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static ClickableSpan[] m15987q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m15988u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m15989w(view);
        if (w != null) {
            return w;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C3617d.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: w */
    private SparseArray<WeakReference<ClickableSpan>> m15989w(View view) {
        return (SparseArray) view.getTag(C3617d.tag_accessibility_clickable_spans);
    }

    /* renamed from: z */
    private boolean m15990z() {
        return !m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: A0 */
    public void mo13081A0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11789a.setShowingHintText(z);
        } else {
            m15981W(4, z);
        }
    }

    /* renamed from: B */
    public boolean mo13082B() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f11789a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: B0 */
    public void mo13083B0(View view) {
        this.f11791c = -1;
        this.f11789a.setSource(view);
    }

    /* renamed from: C */
    public boolean mo13084C() {
        return this.f11789a.isCheckable();
    }

    /* renamed from: C0 */
    public void mo13085C0(View view, int i) {
        this.f11791c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.setSource(view, i);
        }
    }

    /* renamed from: D */
    public boolean mo13086D() {
        return this.f11789a.isChecked();
    }

    /* renamed from: D0 */
    public void mo13087D0(CharSequence charSequence) {
        if (C3643a.m15698b()) {
            this.f11789a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: E */
    public boolean mo13088E() {
        return this.f11789a.isClickable();
    }

    /* renamed from: E0 */
    public void mo13089E0(CharSequence charSequence) {
        this.f11789a.setText(charSequence);
    }

    /* renamed from: F */
    public boolean mo13090F() {
        return this.f11789a.isEnabled();
    }

    /* renamed from: F0 */
    public void mo13091F0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f11789a.setTraversalAfter(view);
        }
    }

    /* renamed from: G */
    public boolean mo13092G() {
        return this.f11789a.isFocusable();
    }

    /* renamed from: G0 */
    public void mo13093G0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.setVisibleToUser(z);
        }
    }

    /* renamed from: H */
    public boolean mo13094H() {
        return this.f11789a.isFocused();
    }

    /* renamed from: H0 */
    public AccessibilityNodeInfo mo13095H0() {
        return this.f11789a;
    }

    /* renamed from: I */
    public boolean mo13096I() {
        return this.f11789a.isLongClickable();
    }

    /* renamed from: J */
    public boolean mo13097J() {
        return this.f11789a.isPassword();
    }

    /* renamed from: K */
    public boolean mo13098K() {
        return this.f11789a.isScrollable();
    }

    /* renamed from: L */
    public boolean mo13099L() {
        return this.f11789a.isSelected();
    }

    /* renamed from: M */
    public boolean mo13100M() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f11789a.isShowingHintText();
        }
        return m15986l(4);
    }

    /* renamed from: N */
    public boolean mo13101N() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f11789a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: R */
    public boolean mo13102R(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f11789a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: S */
    public void mo13103S() {
        this.f11789a.recycle();
    }

    /* renamed from: T */
    public boolean mo13104T(C3737a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f11789a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f11803a);
        }
        return false;
    }

    /* renamed from: V */
    public void mo13105V(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: X */
    public void mo13106X(Rect rect) {
        this.f11789a.setBoundsInParent(rect);
    }

    /* renamed from: Y */
    public void mo13107Y(Rect rect) {
        this.f11789a.setBoundsInScreen(rect);
    }

    /* renamed from: Z */
    public void mo13108Z(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.setCanOpenPopup(z);
        }
    }

    /* renamed from: a */
    public void mo13109a(int i) {
        this.f11789a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo13110a0(boolean z) {
        this.f11789a.setCheckable(z);
    }

    /* renamed from: b */
    public void mo13111b(C3737a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11789a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f11803a);
        }
    }

    /* renamed from: b0 */
    public void mo13112b0(boolean z) {
        this.f11789a.setChecked(z);
    }

    /* renamed from: c */
    public void mo13113c(View view) {
        this.f11789a.addChild(view);
    }

    /* renamed from: c0 */
    public void mo13114c0(CharSequence charSequence) {
        this.f11789a.setClassName(charSequence);
    }

    /* renamed from: d */
    public void mo13115d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void mo13116d0(boolean z) {
        this.f11789a.setClickable(z);
    }

    /* renamed from: e0 */
    public void mo13117e0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f11789a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C3738b) obj).f11807a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3736c)) {
            return false;
        }
        C3736c cVar = (C3736c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11789a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f11789a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f11789a)) {
            return false;
        }
        return this.f11791c == cVar.f11791c && this.f11790b == cVar.f11790b;
    }

    /* renamed from: f */
    public void mo13119f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m15983g();
            m15980U(view);
            ClickableSpan[] q = m15987q(charSequence);
            if (q != null && q.length > 0) {
                mo13141s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C3617d.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> u = m15988u(view);
                int i2 = 0;
                while (q != null && i2 < q.length) {
                    int A = m15975A(q[i2], u);
                    u.put(A, new WeakReference(q[i2]));
                    m15982e(q[i2], (Spanned) charSequence, A);
                    i2++;
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo13120f0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f11789a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C3739c) obj).f11808a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: g0 */
    public void mo13121g0(CharSequence charSequence) {
        this.f11789a.setContentDescription(charSequence);
    }

    /* renamed from: h0 */
    public void mo13122h0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.setDismissable(z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11789a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C3737a> mo13124i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f11789a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3737a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo13125i0(boolean z) {
        this.f11789a.setEnabled(z);
    }

    /* renamed from: j0 */
    public void mo13126j0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11789a.setError(charSequence);
        }
    }

    /* renamed from: k */
    public int mo13127k() {
        return this.f11789a.getActions();
    }

    /* renamed from: k0 */
    public void mo13128k0(boolean z) {
        this.f11789a.setFocusable(z);
    }

    /* renamed from: l0 */
    public void mo13129l0(boolean z) {
        this.f11789a.setFocused(z);
    }

    @Deprecated
    /* renamed from: m */
    public void mo13130m(Rect rect) {
        this.f11789a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo13131m0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11789a.setHeading(z);
        } else {
            m15981W(2, z);
        }
    }

    /* renamed from: n */
    public void mo13132n(Rect rect) {
        this.f11789a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo13133n0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f11789a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f11789a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: o */
    public int mo13134o() {
        return this.f11789a.getChildCount();
    }

    /* renamed from: o0 */
    public void mo13135o0(boolean z) {
        this.f11789a.setLongClickable(z);
    }

    /* renamed from: p */
    public CharSequence mo13136p() {
        return this.f11789a.getClassName();
    }

    /* renamed from: p0 */
    public void mo13137p0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11789a.setMaxTextLength(i);
        }
    }

    /* renamed from: q0 */
    public void mo13138q0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.setMovementGranularities(i);
        }
    }

    /* renamed from: r */
    public CharSequence mo13139r() {
        return this.f11789a.getContentDescription();
    }

    /* renamed from: r0 */
    public void mo13140r0(CharSequence charSequence) {
        this.f11789a.setPackageName(charSequence);
    }

    /* renamed from: s */
    public Bundle mo13141s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f11789a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: s0 */
    public void mo13142s0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f11789a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f11789a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public int mo13143t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f11789a.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void mo13144t0(View view) {
        this.f11790b = -1;
        this.f11789a.setParent(view);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo13130m(rect);
        sb.append("; boundsInParent: " + rect);
        mo13132n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo13147v());
        sb.append("; className: ");
        sb.append(mo13136p());
        sb.append("; text: ");
        sb.append(mo13150x());
        sb.append("; contentDescription: ");
        sb.append(mo13139r());
        sb.append("; viewId: ");
        sb.append(mo13152y());
        sb.append("; checkable: ");
        sb.append(mo13084C());
        sb.append("; checked: ");
        sb.append(mo13086D());
        sb.append("; focusable: ");
        sb.append(mo13092G());
        sb.append("; focused: ");
        sb.append(mo13094H());
        sb.append("; selected: ");
        sb.append(mo13099L());
        sb.append("; clickable: ");
        sb.append(mo13088E());
        sb.append("; longClickable: ");
        sb.append(mo13096I());
        sb.append("; enabled: ");
        sb.append(mo13090F());
        sb.append("; password: ");
        sb.append(mo13097J());
        sb.append("; scrollable: " + mo13098K());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C3737a> i = mo13124i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C3737a aVar = i.get(i2);
                String j = m15985j(aVar.mo13156b());
                if (j.equals("ACTION_UNKNOWN") && aVar.mo13157c() != null) {
                    j = aVar.mo13157c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = mo13127k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= ~numberOfTrailingZeros;
                sb.append(m15985j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void mo13146u0(View view, int i) {
        this.f11790b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f11789a.setParent(view, i);
        }
    }

    /* renamed from: v */
    public CharSequence mo13147v() {
        return this.f11789a.getPackageName();
    }

    /* renamed from: v0 */
    public void mo13148v0(C3740d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f11809a);
        }
    }

    /* renamed from: w0 */
    public void mo13149w0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11789a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: x */
    public CharSequence mo13150x() {
        if (!m15990z()) {
            return this.f11789a.getText();
        }
        List<Integer> h = m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m15984h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f11789a.getText(), 0, this.f11789a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C3734a(h4.get(i).intValue(), this, mo13141s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: x0 */
    public void mo13151x0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11789a.setScreenReaderFocusable(z);
        } else {
            m15981W(1, z);
        }
    }

    /* renamed from: y */
    public String mo13152y() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f11789a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: y0 */
    public void mo13153y0(boolean z) {
        this.f11789a.setScrollable(z);
    }

    /* renamed from: z0 */
    public void mo13154z0(boolean z) {
        this.f11789a.setSelected(z);
    }
}
