package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.pw */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5463pw {

    /* renamed from: a */
    private static final ArrayList<C5461pu> f21543a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f21544b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static int m29197a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m29203g(str)) {
            return 1;
        }
        if (m29204h(str)) {
            return 2;
        }
        if ("text".equals(m29205i(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(m29205i(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f21543a.size();
        for (int i = 0; i < size; i++) {
            C5461pu puVar = f21543a.get(i);
            String str2 = puVar.f21511a;
            if (str.equals((Object) null)) {
                int i2 = puVar.f21513c;
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: b */
    static C5425ov m29198b(String str) {
        Matcher matcher = f21544b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        String group2 = matcher.group(2);
        try {
            return new C5425ov(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m29199c(String str) {
        C5425ov b;
        String a = a13.m20554a(str.trim());
        if (a.startsWith("avc1") || a.startsWith("avc3")) {
            return "video/avc";
        }
        if (a.startsWith("hev1") || a.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (a.startsWith("dvav") || a.startsWith("dva1") || a.startsWith("dvhe") || a.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (a.startsWith("av01")) {
            return "video/av01";
        }
        if (a.startsWith("vp9") || a.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (a.startsWith("vp8") || a.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String str2 = null;
        if (a.startsWith("mp4a")) {
            if (a.startsWith("mp4a.") && (b = m29198b(a)) != null) {
                str2 = m29200d(b.f21197a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (a.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (a.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (a.startsWith("ac-3") || a.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (a.startsWith("ec-3") || a.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (a.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (a.startsWith("ac-4") || a.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (a.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (a.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (a.startsWith("dtsh") || a.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (a.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (a.startsWith("opus")) {
                return "audio/opus";
            }
            if (a.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (a.startsWith("flac")) {
                return "audio/flac";
            }
            if (a.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (a.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (a.contains("cea708")) {
                return "application/cea-708";
            }
            if (a.contains("eia608") || a.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f21543a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C5461pu puVar = f21543a.get(i);
                String str3 = puVar.f21512b;
                if (a.startsWith((String) null)) {
                    String str4 = puVar.f21511a;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    /* renamed from: d */
    public static String m29200d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m29201e(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L_0x0020
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            return r4
        L_0x003c:
            java.lang.String r4 = "audio/wav"
            return r4
        L_0x003f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L_0x0042:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5463pw.m29201e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29202f(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.hashCode()
            r2 = 5
            r3 = 10
            r4 = 2
            r5 = 1
            switch(r1) {
                case -2123537834: goto L_0x0079;
                case -432837260: goto L_0x006f;
                case -432837259: goto L_0x0065;
                case -53558318: goto L_0x005a;
                case 187078296: goto L_0x0050;
                case 187094639: goto L_0x0046;
                case 1504578661: goto L_0x003b;
                case 1504619009: goto L_0x0031;
                case 1504831518: goto L_0x0027;
                case 1903231877: goto L_0x001d;
                case 1903589369: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0084
        L_0x0012:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 5
            goto L_0x0085
        L_0x001d:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 4
            goto L_0x0085
        L_0x0027:
            java.lang.String r1 = "audio/mpeg"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 0
            goto L_0x0085
        L_0x0031:
            java.lang.String r1 = "audio/flac"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 6
            goto L_0x0085
        L_0x003b:
            java.lang.String r1 = "audio/eac3"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 8
            goto L_0x0085
        L_0x0046:
            java.lang.String r1 = "audio/raw"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 3
            goto L_0x0085
        L_0x0050:
            java.lang.String r1 = "audio/ac3"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 7
            goto L_0x0085
        L_0x005a:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 10
            goto L_0x0085
        L_0x0065:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 2
            goto L_0x0085
        L_0x006f:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0079:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0084
            r6 = 9
            goto L_0x0085
        L_0x0084:
            r6 = -1
        L_0x0085:
            switch(r6) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00c1;
                case 10: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            return r0
        L_0x0089:
            if (r7 != 0) goto L_0x008c
            return r0
        L_0x008c:
            com.google.android.gms.internal.ads.ov r6 = m29198b(r7)
            if (r6 != 0) goto L_0x0093
            return r0
        L_0x0093:
            int r6 = r6.f21198b
            r7 = 16
            if (r6 == r4) goto L_0x00bb
            if (r6 == r2) goto L_0x00b9
            r1 = 29
            if (r6 == r1) goto L_0x00b6
            r1 = 42
            if (r6 == r1) goto L_0x00b3
            r1 = 22
            if (r6 == r1) goto L_0x00b0
            r1 = 23
            if (r6 == r1) goto L_0x00ad
            r3 = 0
            goto L_0x00bb
        L_0x00ad:
            r3 = 15
            goto L_0x00bb
        L_0x00b0:
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x00bb
        L_0x00b3:
            r3 = 16
            goto L_0x00bb
        L_0x00b6:
            r3 = 12
            goto L_0x00bb
        L_0x00b9:
            r3 = 11
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            if (r3 == r7) goto L_0x00c0
            return r5
        L_0x00c0:
            return r0
        L_0x00c1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5463pw.m29202f(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: g */
    public static boolean m29203g(String str) {
        return "audio".equals(m29205i(str));
    }

    /* renamed from: h */
    public static boolean m29204h(String str) {
        return "video".equals(m29205i(str));
    }

    /* renamed from: i */
    private static String m29205i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
