package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.h */
/* compiled from: StateSet */
public class C0442h {

    /* renamed from: a */
    int f2453a = -1;

    /* renamed from: b */
    int f2454b = -1;

    /* renamed from: c */
    int f2455c = -1;

    /* renamed from: d */
    private SparseArray<C0443a> f2456d = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.h$a */
    /* compiled from: StateSet */
    static class C0443a {

        /* renamed from: a */
        int f2457a;

        /* renamed from: b */
        ArrayList<C0444b> f2458b = new ArrayList<>();

        /* renamed from: c */
        int f2459c = -1;

        public C0443a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.State_android_id) {
                    this.f2457a = obtainStyledAttributes.getResourceId(index, this.f2457a);
                } else if (index == C0439f.State_constraints) {
                    this.f2459c = obtainStyledAttributes.getResourceId(index, this.f2459c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2459c);
                    context.getResources().getResourceName(this.f2459c);
                    boolean equals = "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2993a(C0444b bVar) {
            this.f2458b.add(bVar);
        }

        /* renamed from: b */
        public int mo2994b(float f, float f2) {
            for (int i = 0; i < this.f2458b.size(); i++) {
                if (this.f2458b.get(i).mo2995a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.h$b */
    /* compiled from: StateSet */
    static class C0444b {

        /* renamed from: a */
        float f2460a = Float.NaN;

        /* renamed from: b */
        float f2461b = Float.NaN;

        /* renamed from: c */
        float f2462c = Float.NaN;

        /* renamed from: d */
        float f2463d = Float.NaN;

        /* renamed from: e */
        int f2464e = -1;

        public C0444b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.Variant_constraints) {
                    this.f2464e = obtainStyledAttributes.getResourceId(index, this.f2464e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2464e);
                    context.getResources().getResourceName(this.f2464e);
                    boolean equals = "layout".equals(resourceTypeName);
                } else if (index == C0439f.Variant_region_heightLessThan) {
                    this.f2463d = obtainStyledAttributes.getDimension(index, this.f2463d);
                } else if (index == C0439f.Variant_region_heightMoreThan) {
                    this.f2461b = obtainStyledAttributes.getDimension(index, this.f2461b);
                } else if (index == C0439f.Variant_region_widthLessThan) {
                    this.f2462c = obtainStyledAttributes.getDimension(index, this.f2462c);
                } else if (index == C0439f.Variant_region_widthMoreThan) {
                    this.f2460a = obtainStyledAttributes.getDimension(index, this.f2460a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2995a(float f, float f2) {
            if (!Float.isNaN(this.f2460a) && f < this.f2460a) {
                return false;
            }
            if (!Float.isNaN(this.f2461b) && f2 < this.f2461b) {
                return false;
            }
            if (!Float.isNaN(this.f2462c) && f > this.f2462c) {
                return false;
            }
            if (Float.isNaN(this.f2463d) || f2 <= this.f2463d) {
                return true;
            }
            return false;
        }
    }

    public C0442h(Context context, XmlPullParser xmlPullParser) {
        new SparseArray();
        m2822b(context, xmlPullParser);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2822b(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = androidx.constraintlayout.widget.C0439f.StateSet
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = 0
        L_0x0010:
            if (r3 >= r1) goto L_0x0025
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C0439f.StateSet_defaultState
            if (r4 != r5) goto L_0x0022
            int r5 = r9.f2453a
            int r4 = r0.getResourceId(r4, r5)
            r9.f2453a = r4
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x002d:
            r3 = 1
            if (r1 == r3) goto L_0x00a7
            if (r1 == 0) goto L_0x0096
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L_0x0046
            if (r1 == r5) goto L_0x003b
            goto L_0x0099
        L_0x003b:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            boolean r1 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0099
            return
        L_0x0046:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7 = -1
            int r8 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            switch(r8) {
                case 80204913: goto L_0x006e;
                case 1301459538: goto L_0x0064;
                case 1382829617: goto L_0x005d;
                case 1901439077: goto L_0x0053;
                default: goto L_0x0052;
            }     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0052:
            goto L_0x0078
        L_0x0053:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 3
            goto L_0x0079
        L_0x005d:
            boolean r1 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0064:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 0
            goto L_0x0079
        L_0x006e:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 2
            goto L_0x0079
        L_0x0078:
            r3 = -1
        L_0x0079:
            if (r3 == r6) goto L_0x0089
            if (r3 == r5) goto L_0x007e
            goto L_0x0099
        L_0x007e:
            androidx.constraintlayout.widget.h$b r1 = new androidx.constraintlayout.widget.h$b     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r0 == 0) goto L_0x0099
            r0.mo2993a(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0089:
            androidx.constraintlayout.widget.h$a r0 = new androidx.constraintlayout.widget.h$a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r0.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            android.util.SparseArray<androidx.constraintlayout.widget.h$a> r1 = r9.f2456d     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            int r3 = r0.f2457a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.put(r3, r0)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0096:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0099:
            int r1 = r11.next()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x002d
        L_0x009e:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00a7
        L_0x00a3:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0442h.m2822b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    public int mo2990a(int i, int i2, float f, float f2) {
        C0443a aVar = this.f2456d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            C0444b bVar = null;
            Iterator<C0444b> it = aVar.f2458b.iterator();
            while (it.hasNext()) {
                C0444b next = it.next();
                if (next.mo2995a(f, f2)) {
                    if (i == next.f2464e) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f2464e;
            }
            return aVar.f2459c;
        } else if (aVar.f2459c == i) {
            return i;
        } else {
            Iterator<C0444b> it2 = aVar.f2458b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f2464e) {
                    return i;
                }
            }
            return aVar.f2459c;
        }
    }

    /* renamed from: c */
    public int mo2991c(int i, int i2, int i3) {
        return mo2992d(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: d */
    public int mo2992d(int i, int i2, float f, float f2) {
        C0443a aVar;
        int b;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.f2456d.valueAt(0);
            } else {
                aVar = this.f2456d.get(this.f2454b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f2455c == -1 || !aVar.f2458b.get(i).mo2995a(f, f2)) && i != (b = aVar.mo2994b(f, f2))) {
                return b == -1 ? aVar.f2459c : aVar.f2458b.get(b).f2464e;
            }
            return i;
        }
        C0443a aVar2 = this.f2456d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b2 = aVar2.mo2994b(f, f2);
        return b2 == -1 ? aVar2.f2459c : aVar2.f2458b.get(b2).f2464e;
    }
}
