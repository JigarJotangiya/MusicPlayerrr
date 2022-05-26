package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: ConstraintLayoutStates */
public class C0427b {

    /* renamed from: a */
    private final ConstraintLayout f2299a;

    /* renamed from: b */
    C0430c f2300b;

    /* renamed from: c */
    int f2301c = -1;

    /* renamed from: d */
    int f2302d = -1;

    /* renamed from: e */
    private SparseArray<C0428a> f2303e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0430c> f2304f = new SparseArray<>();

    /* renamed from: g */
    private C0437d f2305g;

    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* compiled from: ConstraintLayoutStates */
    static class C0428a {

        /* renamed from: a */
        int f2306a;

        /* renamed from: b */
        ArrayList<C0429b> f2307b = new ArrayList<>();

        /* renamed from: c */
        int f2308c = -1;

        /* renamed from: d */
        C0430c f2309d;

        public C0428a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.State_android_id) {
                    this.f2306a = obtainStyledAttributes.getResourceId(index, this.f2306a);
                } else if (index == C0439f.State_constraints) {
                    this.f2308c = obtainStyledAttributes.getResourceId(index, this.f2308c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2308c);
                    context.getResources().getResourceName(this.f2308c);
                    if ("layout".equals(resourceTypeName)) {
                        C0430c cVar = new C0430c();
                        this.f2309d = cVar;
                        cVar.mo2960o(context, this.f2308c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2941a(C0429b bVar) {
            this.f2307b.add(bVar);
        }

        /* renamed from: b */
        public int mo2942b(float f, float f2) {
            for (int i = 0; i < this.f2307b.size(); i++) {
                if (this.f2307b.get(i).mo2943a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* compiled from: ConstraintLayoutStates */
    static class C0429b {

        /* renamed from: a */
        float f2310a = Float.NaN;

        /* renamed from: b */
        float f2311b = Float.NaN;

        /* renamed from: c */
        float f2312c = Float.NaN;

        /* renamed from: d */
        float f2313d = Float.NaN;

        /* renamed from: e */
        int f2314e = -1;

        /* renamed from: f */
        C0430c f2315f;

        public C0429b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0439f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.Variant_constraints) {
                    this.f2314e = obtainStyledAttributes.getResourceId(index, this.f2314e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2314e);
                    context.getResources().getResourceName(this.f2314e);
                    if ("layout".equals(resourceTypeName)) {
                        C0430c cVar = new C0430c();
                        this.f2315f = cVar;
                        cVar.mo2960o(context, this.f2314e);
                    }
                } else if (index == C0439f.Variant_region_heightLessThan) {
                    this.f2313d = obtainStyledAttributes.getDimension(index, this.f2313d);
                } else if (index == C0439f.Variant_region_heightMoreThan) {
                    this.f2311b = obtainStyledAttributes.getDimension(index, this.f2311b);
                } else if (index == C0439f.Variant_region_widthLessThan) {
                    this.f2312c = obtainStyledAttributes.getDimension(index, this.f2312c);
                } else if (index == C0439f.Variant_region_widthMoreThan) {
                    this.f2310a = obtainStyledAttributes.getDimension(index, this.f2310a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2943a(float f, float f2) {
            if (!Float.isNaN(this.f2310a) && f < this.f2310a) {
                return false;
            }
            if (!Float.isNaN(this.f2311b) && f2 < this.f2311b) {
                return false;
            }
            if (!Float.isNaN(this.f2312c) && f > this.f2312c) {
                return false;
            }
            if (Float.isNaN(this.f2313d) || f2 <= this.f2313d) {
                return true;
            }
            return false;
        }
    }

    C0427b(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2299a = constraintLayout;
        m2744a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2744a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 3
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 4
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.m2745b(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.b$b r1 = new androidx.constraintlayout.widget.b$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.mo2941a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r1 = r8.f2303e     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f2306a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0427b.m2744a(android.content.Context, int):void");
    }

    /* renamed from: b */
    private void m2745b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0430c cVar = new C0430c();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.mo2948E(context, xmlPullParser);
                this.f2304f.put(i, cVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2939c(C0437d dVar) {
    }

    /* renamed from: d */
    public void mo2940d(int i, float f, float f2) {
        C0430c cVar;
        int i2;
        C0428a aVar;
        int b;
        C0430c cVar2;
        int i3;
        int i4 = this.f2301c;
        if (i4 == i) {
            if (i == -1) {
                aVar = this.f2303e.valueAt(0);
            } else {
                aVar = this.f2303e.get(i4);
            }
            int i5 = this.f2302d;
            if ((i5 == -1 || !aVar.f2307b.get(i5).mo2943a(f, f2)) && this.f2302d != (b = aVar.mo2942b(f, f2))) {
                if (b == -1) {
                    cVar2 = this.f2300b;
                } else {
                    cVar2 = aVar.f2307b.get(b).f2315f;
                }
                if (b == -1) {
                    i3 = aVar.f2308c;
                } else {
                    i3 = aVar.f2307b.get(b).f2314e;
                }
                if (cVar2 != null) {
                    this.f2302d = b;
                    C0437d dVar = this.f2305g;
                    if (dVar != null) {
                        dVar.mo2987b(-1, i3);
                    }
                    cVar2.mo2955i(this.f2299a);
                    C0437d dVar2 = this.f2305g;
                    if (dVar2 != null) {
                        dVar2.mo2986a(-1, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f2301c = i;
        C0428a aVar2 = this.f2303e.get(i);
        int b2 = aVar2.mo2942b(f, f2);
        if (b2 == -1) {
            cVar = aVar2.f2309d;
        } else {
            cVar = aVar2.f2307b.get(b2).f2315f;
        }
        if (b2 == -1) {
            i2 = aVar2.f2308c;
        } else {
            i2 = aVar2.f2307b.get(b2).f2314e;
        }
        if (cVar == null) {
            StringBuilder sb = new StringBuilder(79);
            sb.append("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            Log.v("ConstraintLayoutStates", sb.toString());
            return;
        }
        this.f2302d = b2;
        C0437d dVar3 = this.f2305g;
        if (dVar3 != null) {
            dVar3.mo2987b(i, i2);
        }
        cVar.mo2955i(this.f2299a);
        C0437d dVar4 = this.f2305g;
        if (dVar4 != null) {
            dVar4.mo2986a(i, i2);
        }
    }
}
