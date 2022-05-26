package p402l.p406b.p407a.p416i;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p426c.C9130j;

/* renamed from: l.b.a.i.d */
/* compiled from: AudioFileReader */
public abstract class C9051d {

    /* renamed from: a */
    public static Logger f35529a = Logger.getLogger("org.jaudiotagger.audio.generic");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C9053f mo31290a(RandomAccessFile randomAccessFile) throws C9015a, IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C9130j mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC, Splitter:B:32:0x00b2] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p402l.p406b.p407a.C8942a mo31298c(java.io.File r11) throws p402l.p406b.p407a.p413g.C9015a, java.io.IOException, p402l.p406b.p426c.C9131k, p402l.p406b.p407a.p413g.C9022h, p402l.p406b.p407a.p413g.C9018d {
        /*
            r10 = this;
            java.util.logging.Logger r0 = f35529a
            java.util.logging.Level r1 = java.util.logging.Level.CONFIG
            boolean r0 = r0.isLoggable(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            java.util.logging.Logger r0 = f35529a
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_READ
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r11.getAbsolutePath()
            r4[r1] = r5
            java.lang.String r3 = r3.getMsg(r4)
            r0.config(r3)
        L_0x001f:
            boolean r0 = r11.canRead()
            if (r0 == 0) goto L_0x00e0
            long r3 = r11.length()
            r5 = 150(0x96, double:7.4E-322)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
            r0 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ a -> 0x00aa, Exception -> 0x006f, all -> 0x006a }
            java.lang.String r4 = "r"
            r3.<init>(r11, r4)     // Catch:{ a -> 0x00aa, Exception -> 0x006f, all -> 0x006a }
            r4 = 0
            r3.seek(r4)     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            l.b.a.i.f r0 = r10.mo31290a(r3)     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            r3.seek(r4)     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            l.b.c.j r4 = r10.mo31291b(r3)     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            l.b.a.a r5 = new l.b.a.a     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            r5.<init>(r11, r0, r4)     // Catch:{ a -> 0x0068, Exception -> 0x0066 }
            r3.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0065
        L_0x0050:
            java.util.logging.Logger r0 = f35529a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            l.b.b.b r4 = p402l.p406b.p425b.C9118b.GENERAL_READ_FAILED_UNABLE_TO_CLOSE_RANDOM_ACCESS_FILE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r11 = r11.getAbsolutePath()
            r2[r1] = r11
            java.lang.String r11 = r4.getMsg(r2)
            r0.log(r3, r11)
        L_0x0065:
            return r5
        L_0x0066:
            r0 = move-exception
            goto L_0x0073
        L_0x0068:
            r0 = move-exception
            goto L_0x00ae
        L_0x006a:
            r3 = move-exception
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x00b0
        L_0x006f:
            r3 = move-exception
            r9 = r3
            r3 = r0
            r0 = r9
        L_0x0073:
            java.util.logging.Logger r4 = f35529a     // Catch:{ all -> 0x00af }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x00af }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_READ     // Catch:{ all -> 0x00af }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00af }
            java.lang.String r8 = r11.getAbsolutePath()     // Catch:{ all -> 0x00af }
            r7[r1] = r8     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r6.getMsg(r7)     // Catch:{ all -> 0x00af }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x00af }
            l.b.a.g.a r4 = new l.b.a.g.a     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r5.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r11.getAbsolutePath()     // Catch:{ all -> 0x00af }
            r5.append(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r6 = ":"
            r5.append(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x00af }
            r5.append(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00af }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x00af }
            throw r4     // Catch:{ all -> 0x00af }
        L_0x00aa:
            r3 = move-exception
            r9 = r3
            r3 = r0
            r0 = r9
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
        L_0x00b0:
            if (r3 == 0) goto L_0x00cb
            r3.close()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00cb
        L_0x00b6:
            java.util.logging.Logger r3 = f35529a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            l.b.b.b r5 = p402l.p406b.p425b.C9118b.GENERAL_READ_FAILED_UNABLE_TO_CLOSE_RANDOM_ACCESS_FILE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r11 = r11.getAbsolutePath()
            r2[r1] = r11
            java.lang.String r11 = r5.getMsg(r2)
            r3.log(r4, r11)
        L_0x00cb:
            throw r0
        L_0x00cc:
            l.b.a.g.a r0 = new l.b.a.g.a
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_READ_FAILED_FILE_TOO_SMALL
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r11 = r11.getAbsolutePath()
            r2[r1] = r11
            java.lang.String r11 = r3.getMsg(r2)
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x00e0:
            l.b.a.g.a r0 = new l.b.a.g.a
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_READ_FAILED_FILE_TOO_SMALL
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r11 = r11.getAbsolutePath()
            r2[r1] = r11
            java.lang.String r11 = r3.getMsg(r2)
            r0.<init>((java.lang.String) r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p416i.C9051d.mo31298c(java.io.File):l.b.a.a");
    }
}
