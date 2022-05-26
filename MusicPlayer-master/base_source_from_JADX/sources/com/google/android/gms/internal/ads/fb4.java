package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fb4 {

    /* renamed from: a */
    private static final String[] f16512a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f16513b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f16514c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static bb4 m23617a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (tz2.m31543c(newPullParser, "x:xmpmeta")) {
                g43<ab4> zzo = g43.zzo();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (tz2.m31543c(newPullParser, "rdf:Description")) {
                        String[] strArr = f16512a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = tz2.m31541a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f16513b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = tz2.m31541a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f16514c;
                                while (true) {
                                    if (i >= 2) {
                                        zzo = g43.zzo();
                                        break;
                                    }
                                    String a3 = tz2.m31541a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        zzo = g43.zzq(new ab4("image/jpeg", "Primary", 0, 0), new ab4("video/mp4", "MotionPhoto", Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (tz2.m31543c(newPullParser, "Container:Directory")) {
                        zzo = m23618b(newPullParser, "Container", "Item");
                    } else if (tz2.m31543c(newPullParser, "GContainer:Directory")) {
                        zzo = m23618b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!tz2.m31542b(newPullParser, "x:xmpmeta"));
                if (zzo.isEmpty()) {
                    return null;
                }
                return new bb4(j2, zzo);
            }
            throw C5464px.zza("Couldn't find xmp metadata", (Throwable) null);
        } catch (C5464px | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static g43<ab4> m23618b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        d43 zzi = g43.zzi();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (tz2.m31543c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a = tz2.m31541a(xmlPullParser, concat3);
                String a2 = tz2.m31541a(xmlPullParser, concat4);
                String a3 = tz2.m31541a(xmlPullParser, concat5);
                String a4 = tz2.m31541a(xmlPullParser, concat6);
                if (a == null || a2 == null) {
                    return g43.zzo();
                }
                zzi.mo16855f(new ab4(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!tz2.m31542b(xmlPullParser, concat2));
        return zzi.mo16856g();
    }
}
