package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.xh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5744xh {

    /* renamed from: A */
    private static final int f25798A = C4934bm.m21437g("sosn");

    /* renamed from: B */
    private static final int f25799B = C4934bm.m21437g("tvsh");

    /* renamed from: C */
    private static final int f25800C = C4934bm.m21437g("----");

    /* renamed from: D */
    private static final String[] f25801D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f25802a = C4934bm.m21437g("nam");

    /* renamed from: b */
    private static final int f25803b = C4934bm.m21437g("trk");

    /* renamed from: c */
    private static final int f25804c = C4934bm.m21437g("cmt");

    /* renamed from: d */
    private static final int f25805d = C4934bm.m21437g("day");

    /* renamed from: e */
    private static final int f25806e = C4934bm.m21437g("ART");

    /* renamed from: f */
    private static final int f25807f = C4934bm.m21437g("too");

    /* renamed from: g */
    private static final int f25808g = C4934bm.m21437g("alb");

    /* renamed from: h */
    private static final int f25809h = C4934bm.m21437g("com");

    /* renamed from: i */
    private static final int f25810i = C4934bm.m21437g("wrt");

    /* renamed from: j */
    private static final int f25811j = C4934bm.m21437g("lyr");

    /* renamed from: k */
    private static final int f25812k = C4934bm.m21437g("gen");

    /* renamed from: l */
    private static final int f25813l = C4934bm.m21437g("covr");

    /* renamed from: m */
    private static final int f25814m = C4934bm.m21437g("gnre");

    /* renamed from: n */
    private static final int f25815n = C4934bm.m21437g("grp");

    /* renamed from: o */
    private static final int f25816o = C4934bm.m21437g("disk");

    /* renamed from: p */
    private static final int f25817p = C4934bm.m21437g("trkn");

    /* renamed from: q */
    private static final int f25818q = C4934bm.m21437g("tmpo");

    /* renamed from: r */
    private static final int f25819r = C4934bm.m21437g("cpil");

    /* renamed from: s */
    private static final int f25820s = C4934bm.m21437g("aART");

    /* renamed from: t */
    private static final int f25821t = C4934bm.m21437g("sonm");

    /* renamed from: u */
    private static final int f25822u = C4934bm.m21437g("soal");

    /* renamed from: v */
    private static final int f25823v = C4934bm.m21437g("soar");

    /* renamed from: w */
    private static final int f25824w = C4934bm.m21437g("soaa");

    /* renamed from: x */
    private static final int f25825x = C4934bm.m21437g("soco");

    /* renamed from: y */
    private static final int f25826y = C4934bm.m21437g("rtng");

    /* renamed from: z */
    private static final int f25827z = C4934bm.m21437g("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x01d5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzatq m33697a(com.google.android.gms.internal.ads.C5600tl r13) {
        /*
            int r0 = r13.mo21084c()
            int r1 = r13.mo21086e()
            int r0 = r0 + r1
            int r1 = r13.mo21086e()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            java.lang.String r5 = "MetadataUtil"
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01d8
            int r2 = f25814m     // Catch:{ all -> 0x01d5 }
            r7 = -1
            if (r1 != r2) goto L_0x0045
            int r1 = m33698b(r13)     // Catch:{ all -> 0x01d5 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String[] r2 = f25801D     // Catch:{ all -> 0x01d5 }
            int r3 = r2.length     // Catch:{ all -> 0x01d5 }
            r3 = 148(0x94, float:2.07E-43)
            if (r1 > r3) goto L_0x0032
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x01d5 }
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzatz r2 = new com.google.android.gms.internal.ads.zzatz     // Catch:{ all -> 0x01d5 }
            r2.<init>(r4, r6, r1)     // Catch:{ all -> 0x01d5 }
            r6 = r2
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d5 }
        L_0x0041:
            r13.mo21103v(r0)
            return r6
        L_0x0045:
            int r2 = f25816o     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0053
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.zzatz r1 = m33700d(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0053:
            int r2 = f25817p     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0061
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.zzatz r1 = m33700d(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0061:
            int r2 = f25818q     // Catch:{ all -> 0x01d5 }
            r4 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0071
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.zzatx r1 = m33699c(r1, r2, r13, r4, r8)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0071:
            int r2 = f25819r     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x007f
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.zzatx r1 = m33699c(r1, r2, r13, r4, r4)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x007f:
            int r2 = f25813l     // Catch:{ all -> 0x01d5 }
            r9 = 4
            if (r1 != r2) goto L_0x00dd
            int r1 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r2 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r3 = com.google.android.gms.internal.ads.C5300lh.f19356F0     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x00d4
            int r2 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r2 = com.google.android.gms.internal.ads.C5300lh.m26726a(r2)     // Catch:{ all -> 0x01d5 }
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00a1
            java.lang.String r3 = "image/jpeg"
            goto L_0x00a9
        L_0x00a1:
            if (r2 != r4) goto L_0x00a8
            java.lang.String r3 = "image/png"
            r2 = 14
            goto L_0x00a9
        L_0x00a8:
            r3 = r6
        L_0x00a9:
            if (r3 != 0) goto L_0x00c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d5 }
            r3 = 41
            r1.<init>(r3)     // Catch:{ all -> 0x01d5 }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x01d5 }
            r1.append(r2)     // Catch:{ all -> 0x01d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d5 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d5 }
            goto L_0x00d9
        L_0x00c2:
            r13.mo21104w(r9)     // Catch:{ all -> 0x01d5 }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x01d5 }
            r13.mo21098q(r2, r8, r1)     // Catch:{ all -> 0x01d5 }
            com.google.android.gms.internal.ads.zzatt r1 = new com.google.android.gms.internal.ads.zzatt     // Catch:{ all -> 0x01d5 }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x01d5 }
            r6 = r1
            goto L_0x00d9
        L_0x00d4:
            java.lang.String r1 = "Failed to parse cover art attribute"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d5 }
        L_0x00d9:
            r13.mo21103v(r0)
            return r6
        L_0x00dd:
            int r2 = f25820s     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x00eb
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x00eb:
            int r2 = f25821t     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x00f9
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x00f9:
            int r2 = f25822u     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0107
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0107:
            int r2 = f25823v     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0115
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0115:
            int r2 = f25824w     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0123
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0123:
            int r2 = f25825x     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0131
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0131:
            int r2 = f25826y     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x013f
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzatx r1 = m33699c(r1, r2, r13, r8, r8)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x013f:
            int r2 = f25827z     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x014d
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzatx r1 = m33699c(r1, r2, r13, r8, r4)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x014d:
            int r2 = f25798A     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x015b
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x015b:
            int r2 = f25799B     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x0169
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0169:
            int r2 = f25800C     // Catch:{ all -> 0x01d5 }
            if (r1 != r2) goto L_0x028e
            r1 = r6
            r2 = r1
            r4 = -1
            r5 = -1
        L_0x0171:
            int r8 = r13.mo21084c()     // Catch:{ all -> 0x01d5 }
            if (r8 >= r0) goto L_0x01ab
            int r8 = r13.mo21084c()     // Catch:{ all -> 0x01d5 }
            int r10 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r11 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            r13.mo21104w(r9)     // Catch:{ all -> 0x01d5 }
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19352D0     // Catch:{ all -> 0x01d5 }
            if (r11 != r12) goto L_0x0191
            int r10 = r10 + -12
            java.lang.String r1 = r13.mo21096o(r10)     // Catch:{ all -> 0x01d5 }
            goto L_0x0171
        L_0x0191:
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19354E0     // Catch:{ all -> 0x01d5 }
            if (r11 != r12) goto L_0x019c
            int r10 = r10 + -12
            java.lang.String r2 = r13.mo21096o(r10)     // Catch:{ all -> 0x01d5 }
            goto L_0x0171
        L_0x019c:
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19356F0     // Catch:{ all -> 0x01d5 }
            if (r11 != r12) goto L_0x01a1
            r5 = r10
        L_0x01a1:
            if (r11 == r12) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r4 = r8
        L_0x01a5:
            int r10 = r10 + -12
            r13.mo21104w(r10)     // Catch:{ all -> 0x01d5 }
            goto L_0x0171
        L_0x01ab:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x01d5 }
            if (r1 == 0) goto L_0x01d1
            java.lang.String r1 = "iTunSMPB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01d5 }
            if (r1 == 0) goto L_0x01d1
            if (r4 != r7) goto L_0x01be
            goto L_0x01d1
        L_0x01be:
            r13.mo21103v(r4)     // Catch:{ all -> 0x01d5 }
            r1 = 16
            r13.mo21104w(r1)     // Catch:{ all -> 0x01d5 }
            int r5 = r5 + -16
            java.lang.String r1 = r13.mo21096o(r5)     // Catch:{ all -> 0x01d5 }
            com.google.android.gms.internal.ads.zzatv r6 = new com.google.android.gms.internal.ads.zzatv     // Catch:{ all -> 0x01d5 }
            r6.<init>(r3, r2, r1)     // Catch:{ all -> 0x01d5 }
        L_0x01d1:
            r13.mo21103v(r0)
            return r6
        L_0x01d5:
            r1 = move-exception
            goto L_0x02bf
        L_0x01d8:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r7 = f25804c     // Catch:{ all -> 0x01d5 }
            if (r2 != r7) goto L_0x021a
            int r2 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r4 = r13.mo21086e()     // Catch:{ all -> 0x01d5 }
            int r7 = com.google.android.gms.internal.ads.C5300lh.f19356F0     // Catch:{ all -> 0x01d5 }
            if (r4 != r7) goto L_0x01fd
            r1 = 8
            r13.mo21104w(r1)     // Catch:{ all -> 0x01d5 }
            int r2 = r2 + -16
            java.lang.String r1 = r13.mo21096o(r2)     // Catch:{ all -> 0x01d5 }
            com.google.android.gms.internal.ads.zzatv r6 = new com.google.android.gms.internal.ads.zzatv     // Catch:{ all -> 0x01d5 }
            r6.<init>(r3, r1, r1)     // Catch:{ all -> 0x01d5 }
            goto L_0x0216
        L_0x01fd:
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = com.google.android.gms.internal.ads.C5300lh.m26728c(r1)     // Catch:{ all -> 0x01d5 }
            int r3 = r1.length()     // Catch:{ all -> 0x01d5 }
            if (r3 == 0) goto L_0x020e
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d5 }
            goto L_0x0213
        L_0x020e:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01d5 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d5 }
        L_0x0213:
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d5 }
        L_0x0216:
            r13.mo21103v(r0)
            return r6
        L_0x021a:
            int r3 = f25802a     // Catch:{ all -> 0x01d5 }
            if (r2 == r3) goto L_0x02b5
            int r3 = f25803b     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x0224
            goto L_0x02b5
        L_0x0224:
            int r3 = f25809h     // Catch:{ all -> 0x01d5 }
            if (r2 == r3) goto L_0x02ab
            int r3 = f25810i     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x022e
            goto L_0x02ab
        L_0x022e:
            int r3 = f25805d     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x023c
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x023c:
            int r3 = f25806e     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x024a
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x024a:
            int r3 = f25807f     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x0258
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0258:
            int r3 = f25808g     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x0266
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0266:
            int r3 = f25811j     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x0274
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0274:
            int r3 = f25812k     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x0280
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r4, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x0280:
            int r3 = f25815n     // Catch:{ all -> 0x01d5 }
            if (r2 != r3) goto L_0x028e
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x028e:
            java.lang.String r2 = "Skipped unknown metadata entry: "
            java.lang.String r1 = com.google.android.gms.internal.ads.C5300lh.m26728c(r1)     // Catch:{ all -> 0x01d5 }
            int r3 = r1.length()     // Catch:{ all -> 0x01d5 }
            if (r3 == 0) goto L_0x029f
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d5 }
            goto L_0x02a4
        L_0x029f:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x01d5 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d5 }
        L_0x02a4:
            android.util.Log.d(r5, r1)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r6
        L_0x02ab:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x02b5:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzatz r1 = m33701e(r1, r2, r13)     // Catch:{ all -> 0x01d5 }
            r13.mo21103v(r0)
            return r1
        L_0x02bf:
            r13.mo21103v(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5744xh.m33697a(com.google.android.gms.internal.ads.tl):com.google.android.gms.internal.ads.zzatq");
    }

    /* renamed from: b */
    private static int m33698b(C5600tl tlVar) {
        tlVar.mo21104w(4);
        if (tlVar.mo21086e() == C5300lh.f19356F0) {
            tlVar.mo21104w(8);
            return tlVar.mo21088g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static zzatx m33699c(int i, String str, C5600tl tlVar, boolean z, boolean z2) {
        int b = m33698b(tlVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String c = C5300lh.m26728c(i);
            Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse uint8 attribute: ".concat(c) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new zzatz(str, (String) null, Integer.toString(b));
        } else {
            return new zzatv("und", str, Integer.toString(b));
        }
    }

    /* renamed from: d */
    private static zzatz m33700d(int i, String str, C5600tl tlVar) {
        int e = tlVar.mo21086e();
        if (tlVar.mo21086e() == C5300lh.f19356F0 && e >= 22) {
            tlVar.mo21104w(10);
            int j = tlVar.mo21091j();
            if (j > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(j);
                String sb2 = sb.toString();
                int j2 = tlVar.mo21091j();
                if (j2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(j2);
                    sb2 = sb3.toString();
                }
                return new zzatz(str, (String) null, sb2);
            }
        }
        String c = C5300lh.m26728c(i);
        Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse index/count attribute: ".concat(c) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: e */
    private static zzatz m33701e(int i, String str, C5600tl tlVar) {
        int e = tlVar.mo21086e();
        if (tlVar.mo21086e() == C5300lh.f19356F0) {
            tlVar.mo21104w(8);
            return new zzatz(str, (String) null, tlVar.mo21096o(e - 16));
        }
        String c = C5300lh.m26728c(i);
        Log.w("MetadataUtil", c.length() != 0 ? "Failed to parse text attribute: ".concat(c) : new String("Failed to parse text attribute: "));
        return null;
    }
}
