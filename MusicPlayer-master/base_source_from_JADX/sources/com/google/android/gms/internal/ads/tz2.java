package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tz2 {
    /* renamed from: a */
    public static String m31541a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m31542b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static boolean m31543c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
