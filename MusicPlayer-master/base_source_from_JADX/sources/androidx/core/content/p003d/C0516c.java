package androidx.core.content.p003d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.un4seen.bass.BASS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p082e.p109h.C3620g;
import p082e.p109h.p116m.C3663d;

/* renamed from: androidx.core.content.d.c */
/* compiled from: FontResourcesParserCompat */
public class C0516c {

    /* renamed from: androidx.core.content.d.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C0517a {
    }

    /* renamed from: androidx.core.content.d.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0518b implements C0517a {

        /* renamed from: a */
        private final C0519c[] f2698a;

        public C0518b(C0519c[] cVarArr) {
            this.f2698a = cVarArr;
        }

        /* renamed from: a */
        public C0519c[] mo3276a() {
            return this.f2698a;
        }
    }

    /* renamed from: androidx.core.content.d.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0519c {

        /* renamed from: a */
        private final String f2699a;

        /* renamed from: b */
        private int f2700b;

        /* renamed from: c */
        private boolean f2701c;

        /* renamed from: d */
        private String f2702d;

        /* renamed from: e */
        private int f2703e;

        /* renamed from: f */
        private int f2704f;

        public C0519c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2699a = str;
            this.f2700b = i;
            this.f2701c = z;
            this.f2702d = str2;
            this.f2703e = i2;
            this.f2704f = i3;
        }

        /* renamed from: a */
        public String mo3277a() {
            return this.f2699a;
        }

        /* renamed from: b */
        public int mo3278b() {
            return this.f2704f;
        }

        /* renamed from: c */
        public int mo3279c() {
            return this.f2703e;
        }

        /* renamed from: d */
        public String mo3280d() {
            return this.f2702d;
        }

        /* renamed from: e */
        public int mo3281e() {
            return this.f2700b;
        }

        /* renamed from: f */
        public boolean mo3282f() {
            return this.f2701c;
        }
    }

    /* renamed from: androidx.core.content.d.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0520d implements C0517a {

        /* renamed from: a */
        private final C3663d f2705a;

        /* renamed from: b */
        private final int f2706b;

        /* renamed from: c */
        private final int f2707c;

        /* renamed from: d */
        private final String f2708d;

        public C0520d(C3663d dVar, int i, int i2, String str) {
            this.f2705a = dVar;
            this.f2707c = i;
            this.f2706b = i2;
            this.f2708d = str;
        }

        /* renamed from: a */
        public int mo3283a() {
            return this.f2707c;
        }

        /* renamed from: b */
        public C3663d mo3284b() {
            return this.f2705a;
        }

        /* renamed from: c */
        public String mo3285c() {
            return this.f2708d;
        }

        /* renamed from: d */
        public int mo3286d() {
            return this.f2706b;
        }
    }

    /* renamed from: a */
    private static int m3194a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.p003d.C0516c.C0517a m3195b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.d.c$a r3 = m3197d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0516c.m3195b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.d.c$a");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m3196c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m3194a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3201h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3201h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0517a m3197d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3198e(xmlPullParser, resources);
        }
        m3200g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0517a m3198e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3620g.FontFamily);
        String string = obtainAttributes.getString(C3620g.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C3620g.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C3620g.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C3620g.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C3620g.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C3620g.FontFamily_fontProviderFetchTimeout, BASS.BASS_ERROR_JAVA_CLASS);
        String string4 = obtainAttributes.getString(C3620g.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m3199f(xmlPullParser, resources));
                    } else {
                        m3200g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0518b((C0519c[]) arrayList.toArray(new C0519c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m3200g(xmlPullParser);
        }
        return new C0520d(new C3663d(string, string2, string3, m3196c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0519c m3199f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3620g.FontFamilyFont);
        int i = C3620g.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = C3620g.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C3620g.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C3620g.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C3620g.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C3620g.FontFamilyFont_android_ttcIndex;
        }
        int i5 = C3620g.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C3620g.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C3620g.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C3620g.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3200g(xmlPullParser);
        }
        return new C0519c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m3200g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m3201h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
