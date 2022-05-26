package p402l.p406b.p407a.p416i;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9130j;

/* renamed from: l.b.a.i.e */
/* compiled from: AudioFileWriter */
public abstract class C9052e {

    /* renamed from: b */
    public static Logger f35530b = Logger.getLogger("org.jaudiotagger.audio.generic");

    /* renamed from: a */
    private C9050c f35531a = null;

    /* renamed from: c */
    private void m48264c(C8942a aVar) throws C9017c {
        try {
            if (aVar.mo31270h().isEmpty()) {
                mo31539a(aVar);
            } else if (!aVar.mo31269g().canWrite()) {
                Logger logger = f35530b;
                C9118b bVar = C9118b.GENERAL_WRITE_FAILED;
                logger.severe(bVar.getMsg(aVar.mo31269g().getPath()));
                throw new C9017c(bVar.getMsg(aVar.mo31269g().getPath()));
            } else if (aVar.mo31269g().length() <= 150) {
                Logger logger2 = f35530b;
                C9118b bVar2 = C9118b.GENERAL_WRITE_FAILED_BECAUSE_FILE_IS_TOO_SMALL;
                logger2.severe(bVar2.getMsg(aVar.mo31269g().getPath()));
                throw new C9017c(bVar2.getMsg(aVar.mo31269g().getPath()));
            }
        } catch (C9015a unused) {
            throw new C9017c(C9118b.GENERAL_WRITE_FAILED.getMsg(aVar.mo31269g().getPath()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0298 A[Catch:{ Exception -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cd A[SYNTHETIC, Splitter:B:77:0x01cd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d6 A[Catch:{ Exception -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e1 A[ADDED_TO_REGION, Catch:{ Exception -> 0x01d1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31539a(p402l.p406b.p407a.C8942a r19) throws p402l.p406b.p407a.p413g.C9015a, p402l.p406b.p407a.p413g.C9017c {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = "rw"
            java.lang.String r3 = ":"
            java.lang.String r4 = " or"
            java.lang.String r5 = "AudioFileWriter exception cleaning up delete:"
            java.io.File r6 = r19.mo31269g()
            boolean r6 = r6.canWrite()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x02f9
            java.io.File r6 = r19.mo31269g()
            long r9 = r6.length()
            r11 = 150(0x96, double:7.4E-322)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x02e1
            r6 = 0
            r9 = 0
            r11 = 2
            java.io.File r12 = r19.mo31269g()     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            r13 = 46
            r14 = 95
            java.lang.String r12 = r12.replace(r13, r14)     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            java.lang.String r13 = ".tmp"
            java.io.File r14 = r19.mo31269g()     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            java.io.File r14 = r14.getParentFile()     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            java.io.File r12 = java.io.File.createTempFile(r12, r13, r14)     // Catch:{ Exception -> 0x019a, all -> 0x0194 }
            java.io.RandomAccessFile r13 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0191, all -> 0x018d }
            r13.<init>(r12, r0)     // Catch:{ Exception -> 0x0191, all -> 0x018d }
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x018b, all -> 0x0188 }
            java.io.File r15 = r19.mo31269g()     // Catch:{ Exception -> 0x018b, all -> 0x0188 }
            r14.<init>(r15, r0)     // Catch:{ Exception -> 0x018b, all -> 0x0188 }
            r14.seek(r9)     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
            r13.seek(r9)     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
            l.b.a.i.c r0 = r1.f35531a     // Catch:{ f -> 0x017a }
            if (r0 == 0) goto L_0x0063
            r0.mo31535a(r2, r8)     // Catch:{ f -> 0x017a }
        L_0x0063:
            r1.mo31300b(r14, r13)     // Catch:{ f -> 0x017a }
            l.b.a.i.c r0 = r1.f35531a     // Catch:{ f -> 0x017a }
            if (r0 == 0) goto L_0x006d
            r0.mo31537c(r2, r12)     // Catch:{ f -> 0x017a }
        L_0x006d:
            java.io.File r6 = r19.mo31269g()
            r14.close()     // Catch:{ Exception -> 0x0144 }
            r13.close()     // Catch:{ Exception -> 0x0144 }
            long r13 = r12.length()     // Catch:{ Exception -> 0x0144 }
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x012a
            java.io.File r0 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            boolean r0 = r0.delete()     // Catch:{ Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00f1
            java.io.File r0 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            boolean r0 = r12.renameTo(r0)     // Catch:{ Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r12.exists()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x0172
            boolean r0 = r12.delete()     // Catch:{ Exception -> 0x00b4 }
            if (r0 != 0) goto L_0x0172
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x00b4 }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r9 = r12.getPath()     // Catch:{ Exception -> 0x00b4 }
            r8[r7] = r9     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r6 = r6.getMsg(r8)     // Catch:{ Exception -> 0x00b4 }
            r0.warning(r6)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0172
        L_0x00b4:
            r0 = move-exception
            r6 = r12
            goto L_0x0145
        L_0x00b8:
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x0144 }
            l.b.b.b r9 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_RENAME_TO_ORIGINAL_FILE     // Catch:{ Exception -> 0x0144 }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0144 }
            java.io.File r13 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r13 = r13.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r7] = r13     // Catch:{ Exception -> 0x0144 }
            java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r8] = r13     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = r9.getMsg(r10)     // Catch:{ Exception -> 0x0144 }
            r0.warning(r10)     // Catch:{ Exception -> 0x0144 }
            l.b.a.g.c r0 = new l.b.a.g.c     // Catch:{ Exception -> 0x0144 }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0144 }
            java.io.File r11 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r7] = r11     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = r12.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r8] = r7     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = r9.getMsg(r10)     // Catch:{ Exception -> 0x0144 }
            r0.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0144 }
        L_0x00f1:
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x0144 }
            l.b.b.b r9 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_ORIGINAL_FILE     // Catch:{ Exception -> 0x0144 }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0144 }
            java.io.File r13 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r13 = r13.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r7] = r13     // Catch:{ Exception -> 0x0144 }
            java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r8] = r13     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = r9.getMsg(r10)     // Catch:{ Exception -> 0x0144 }
            r0.warning(r10)     // Catch:{ Exception -> 0x0144 }
            l.b.a.g.c r0 = new l.b.a.g.c     // Catch:{ Exception -> 0x0144 }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0144 }
            java.io.File r11 = r19.mo31269g()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r7] = r11     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = r12.getPath()     // Catch:{ Exception -> 0x0144 }
            r10[r8] = r7     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = r9.getMsg(r10)     // Catch:{ Exception -> 0x0144 }
            r0.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0144 }
        L_0x012a:
            boolean r0 = r12.delete()     // Catch:{ Exception -> 0x0144 }
            if (r0 != 0) goto L_0x0171
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x0144 }
            l.b.b.b r9 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE     // Catch:{ Exception -> 0x0144 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0144 }
            java.lang.String r10 = r12.getPath()     // Catch:{ Exception -> 0x0144 }
            r8[r7] = r10     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = r9.getMsg(r8)     // Catch:{ Exception -> 0x0144 }
            r0.warning(r7)     // Catch:{ Exception -> 0x0144 }
            goto L_0x0171
        L_0x0144:
            r0 = move-exception
        L_0x0145:
            java.util.logging.Logger r7 = f35530b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.io.File r2 = r19.mo31269g()
            java.lang.String r2 = r2.getPath()
            r8.append(r2)
            r8.append(r4)
            java.lang.String r2 = r12.getAbsolutePath()
            r8.append(r2)
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7.severe(r0)
        L_0x0171:
            r12 = r6
        L_0x0172:
            l.b.a.i.c r0 = r1.f35531a
            if (r0 == 0) goto L_0x0179
            r0.mo31538d(r12)
        L_0x0179:
            return
        L_0x017a:
            r0 = move-exception
            l.b.a.g.c r6 = new l.b.a.g.c     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
            r6.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
            throw r6     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            r11 = r0
            r6 = r14
            goto L_0x0198
        L_0x0185:
            r0 = move-exception
            r6 = r14
            goto L_0x019d
        L_0x0188:
            r0 = move-exception
            r11 = r0
            goto L_0x0198
        L_0x018b:
            r0 = move-exception
            goto L_0x019d
        L_0x018d:
            r0 = move-exception
            r11 = r0
            r13 = r6
            goto L_0x0198
        L_0x0191:
            r0 = move-exception
            r13 = r6
            goto L_0x019d
        L_0x0194:
            r0 = move-exception
            r11 = r0
            r12 = r6
            r13 = r12
        L_0x0198:
            r0 = 0
            goto L_0x01c7
        L_0x019a:
            r0 = move-exception
            r12 = r6
            r13 = r12
        L_0x019d:
            l.b.a.g.c r14 = new l.b.a.g.c     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r15.<init>()     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = "\""
            r15.append(r11)     // Catch:{ all -> 0x01c4 }
            java.io.File r11 = r19.mo31269g()     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = r11.getAbsolutePath()     // Catch:{ all -> 0x01c4 }
            r15.append(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = "\" :"
            r15.append(r11)     // Catch:{ all -> 0x01c4 }
            r15.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = r15.toString()     // Catch:{ all -> 0x01c4 }
            r14.<init>(r11, r0)     // Catch:{ all -> 0x01c4 }
            throw r14     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r11 = r0
            r0 = 1
        L_0x01c7:
            java.io.File r14 = r19.mo31269g()
            if (r6 == 0) goto L_0x01d4
            r6.close()     // Catch:{ Exception -> 0x01d1 }
            goto L_0x01d4
        L_0x01d1:
            r0 = move-exception
            goto L_0x02ac
        L_0x01d4:
            if (r13 == 0) goto L_0x01d9
            r13.close()     // Catch:{ Exception -> 0x01d1 }
        L_0x01d9:
            long r16 = r12.length()     // Catch:{ Exception -> 0x01d1 }
            int r6 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0292
            if (r0 != 0) goto L_0x0292
            java.io.File r0 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            boolean r0 = r0.delete()     // Catch:{ Exception -> 0x01d1 }
            if (r0 == 0) goto L_0x0257
            java.io.File r0 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            boolean r0 = r12.renameTo(r0)     // Catch:{ Exception -> 0x01d1 }
            if (r0 == 0) goto L_0x021c
            boolean r0 = r12.exists()     // Catch:{ Exception -> 0x0218 }
            if (r0 == 0) goto L_0x02d9
            boolean r0 = r12.delete()     // Catch:{ Exception -> 0x0218 }
            if (r0 != 0) goto L_0x02d9
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x0218 }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE     // Catch:{ Exception -> 0x0218 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0218 }
            java.lang.String r9 = r12.getPath()     // Catch:{ Exception -> 0x0218 }
            r8[r7] = r9     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = r6.getMsg(r8)     // Catch:{ Exception -> 0x0218 }
            r0.warning(r6)     // Catch:{ Exception -> 0x0218 }
            goto L_0x02d9
        L_0x0218:
            r0 = move-exception
            r14 = r12
            goto L_0x02ac
        L_0x021c:
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x01d1 }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_RENAME_TO_ORIGINAL_FILE     // Catch:{ Exception -> 0x01d1 }
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01d1 }
            java.io.File r9 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x01d1 }
            r10[r7] = r9     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r12.getPath()     // Catch:{ Exception -> 0x01d1 }
            r10[r8] = r9     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r6.getMsg(r10)     // Catch:{ Exception -> 0x01d1 }
            r0.warning(r9)     // Catch:{ Exception -> 0x01d1 }
            l.b.a.g.c r0 = new l.b.a.g.c     // Catch:{ Exception -> 0x01d1 }
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01d1 }
            java.io.File r10 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x01d1 }
            r9[r7] = r10     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r7 = r12.getPath()     // Catch:{ Exception -> 0x01d1 }
            r9[r8] = r7     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = r6.getMsg(r9)     // Catch:{ Exception -> 0x01d1 }
            r0.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x01d1 }
            throw r0     // Catch:{ Exception -> 0x01d1 }
        L_0x0257:
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x01d1 }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_ORIGINAL_FILE     // Catch:{ Exception -> 0x01d1 }
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01d1 }
            java.io.File r9 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r9.getPath()     // Catch:{ Exception -> 0x01d1 }
            r10[r7] = r9     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r12.getPath()     // Catch:{ Exception -> 0x01d1 }
            r10[r8] = r9     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r6.getMsg(r10)     // Catch:{ Exception -> 0x01d1 }
            r0.warning(r9)     // Catch:{ Exception -> 0x01d1 }
            l.b.a.g.c r0 = new l.b.a.g.c     // Catch:{ Exception -> 0x01d1 }
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01d1 }
            java.io.File r10 = r19.mo31269g()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x01d1 }
            r9[r7] = r10     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r7 = r12.getPath()     // Catch:{ Exception -> 0x01d1 }
            r9[r8] = r7     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = r6.getMsg(r9)     // Catch:{ Exception -> 0x01d1 }
            r0.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x01d1 }
            throw r0     // Catch:{ Exception -> 0x01d1 }
        L_0x0292:
            boolean r0 = r12.delete()     // Catch:{ Exception -> 0x01d1 }
            if (r0 != 0) goto L_0x02d8
            java.util.logging.Logger r0 = f35530b     // Catch:{ Exception -> 0x01d1 }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE     // Catch:{ Exception -> 0x01d1 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = r12.getPath()     // Catch:{ Exception -> 0x01d1 }
            r8[r7] = r9     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = r6.getMsg(r8)     // Catch:{ Exception -> 0x01d1 }
            r0.warning(r6)     // Catch:{ Exception -> 0x01d1 }
            goto L_0x02d8
        L_0x02ac:
            java.util.logging.Logger r6 = f35530b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.io.File r2 = r19.mo31269g()
            java.lang.String r2 = r2.getPath()
            r7.append(r2)
            r7.append(r4)
            java.lang.String r2 = r12.getAbsolutePath()
            r7.append(r2)
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.severe(r0)
        L_0x02d8:
            r12 = r14
        L_0x02d9:
            l.b.a.i.c r0 = r1.f35531a
            if (r0 == 0) goto L_0x02e0
            r0.mo31538d(r12)
        L_0x02e0:
            throw r11
        L_0x02e1:
            l.b.a.g.c r0 = new l.b.a.g.c
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_DELETE_FAILED
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.io.File r2 = r19.mo31269g()
            java.lang.String r2 = r2.getPath()
            r4[r7] = r2
            java.lang.String r2 = r3.getMsg(r4)
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x02f9:
            l.b.a.g.c r0 = new l.b.a.g.c
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_DELETE_FAILED
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.io.File r2 = r19.mo31269g()
            java.lang.String r2 = r2.getPath()
            r4[r7] = r2
            java.lang.String r2 = r3.getMsg(r4)
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p416i.C9052e.mo31539a(l.b.a.a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo31300b(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9015a, C9017c, IOException;

    /* renamed from: d */
    public void mo31540d(C9050c cVar) {
        this.f35531a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0338 A[SYNTHETIC, Splitter:B:97:0x0338] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31541e(p402l.p406b.p407a.C8942a r14) throws p402l.p406b.p407a.p413g.C9017c {
        /*
            r13 = this;
            java.lang.String r0 = "rw"
            java.lang.String r1 = ".tmp"
            java.util.logging.Logger r2 = f35530b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Started writing tag data for file:"
            r3.append(r4)
            java.io.File r4 = r14.mo31269g()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.config(r3)
            r13.m48264c(r14)
            boolean r2 = r14 instanceof p402l.p406b.p407a.p417j.C9060c
            if (r2 == 0) goto L_0x002d
            r14.mo31266c()
            return
        L_0x002d:
            r2 = 0
            r3 = 95
            r4 = 46
            r5 = 2
            r6 = 1
            r7 = 0
            java.io.File r8 = r14.mo31269g()     // Catch:{ IOException -> 0x004e }
            java.lang.String r8 = r8.getName()     // Catch:{ IOException -> 0x004e }
            java.lang.String r8 = r8.replace(r4, r3)     // Catch:{ IOException -> 0x004e }
            java.io.File r9 = r14.mo31269g()     // Catch:{ IOException -> 0x004e }
            java.io.File r9 = r9.getParentFile()     // Catch:{ IOException -> 0x004e }
            java.io.File r1 = java.io.File.createTempFile(r8, r1, r9)     // Catch:{ IOException -> 0x004e }
            goto L_0x0087
        L_0x004e:
            r8 = move-exception
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "File name too long"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x03d5
            java.io.File r9 = r14.mo31269g()
            java.lang.String r9 = r9.getName()
            int r9 = r9.length()
            r10 = 50
            if (r9 <= r10) goto L_0x03d5
            java.io.File r8 = r14.mo31269g()     // Catch:{ IOException -> 0x0389 }
            java.lang.String r8 = r8.getName()     // Catch:{ IOException -> 0x0389 }
            java.lang.String r8 = r8.substring(r7, r10)     // Catch:{ IOException -> 0x0389 }
            java.lang.String r3 = r8.replace(r4, r3)     // Catch:{ IOException -> 0x0389 }
            java.io.File r4 = r14.mo31269g()     // Catch:{ IOException -> 0x0389 }
            java.io.File r4 = r4.getParentFile()     // Catch:{ IOException -> 0x0389 }
            java.io.File r1 = java.io.File.createTempFile(r3, r1, r4)     // Catch:{ IOException -> 0x0389 }
        L_0x0087:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x031c }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x031c }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0319 }
            java.io.File r4 = r14.mo31269g()     // Catch:{ IOException -> 0x0319 }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0319 }
            r8 = 0
            r2.seek(r8)     // Catch:{ Exception -> 0x027b }
            r3.seek(r8)     // Catch:{ Exception -> 0x027b }
            l.b.a.i.c r0 = r13.f35531a     // Catch:{ f -> 0x0272 }
            if (r0 == 0) goto L_0x00a4
            r0.mo31535a(r14, r7)     // Catch:{ f -> 0x0272 }
        L_0x00a4:
            l.b.c.j r0 = r14.mo31270h()     // Catch:{ f -> 0x0272 }
            r13.mo31301f(r0, r2, r3)     // Catch:{ f -> 0x0272 }
            l.b.a.i.c r0 = r13.f35531a     // Catch:{ f -> 0x0272 }
            if (r0 == 0) goto L_0x00b2
            r0.mo31537c(r14, r1)     // Catch:{ f -> 0x0272 }
        L_0x00b2:
            r2.close()     // Catch:{ IOException -> 0x00b9 }
            r3.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00d9
        L_0x00b9:
            r0 = move-exception
            java.util.logging.Logger r2 = f35530b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            l.b.b.b r4 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_PROBLEM_CLOSING_FILE_HANDLE
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.io.File r11 = r14.mo31269g()
            java.lang.String r11 = r11.getAbsolutePath()
            r10[r7] = r11
            java.lang.String r11 = r0.getMessage()
            r10[r6] = r11
            java.lang.String r4 = r4.getMsg(r10)
            r2.log(r3, r4, r0)
        L_0x00d9:
            java.io.File r0 = r14.mo31269g()
            long r2 = r1.length()
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0251
            java.io.File r2 = new java.io.File
            java.io.File r3 = r14.mo31269g()
            java.io.File r3 = r3.getAbsoluteFile()
            java.io.File r3 = r3.getParentFile()
            java.lang.String r3 = r3.getPath()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r8 = r14.mo31269g()
            java.lang.String r8 = p402l.p406b.p407a.C8942a.m47874f(r8)
            r4.append(r8)
            java.lang.String r8 = ".old"
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            r3 = 1
        L_0x0114:
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x014b
            java.io.File r2 = new java.io.File
            java.io.File r4 = r14.mo31269g()
            java.io.File r4 = r4.getAbsoluteFile()
            java.io.File r4 = r4.getParentFile()
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = r14.mo31269g()
            java.lang.String r10 = p402l.p406b.p407a.C8942a.m47874f(r10)
            r9.append(r10)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r2.<init>(r4, r9)
            int r3 = r3 + r6
            goto L_0x0114
        L_0x014b:
            java.io.File r3 = r14.mo31269g()
            boolean r3 = p402l.p406b.p407a.p416i.C9057i.m48297B(r3, r2)
            if (r3 != 0) goto L_0x0195
            java.util.logging.Logger r0 = f35530b
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            l.b.b.b r4 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_RENAME_ORIGINAL_FILE_TO_BACKUP
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.io.File r9 = r14.mo31269g()
            java.lang.String r9 = r9.getAbsolutePath()
            r8[r7] = r9
            java.lang.String r9 = r2.getName()
            r8[r6] = r9
            java.lang.String r8 = r4.getMsg(r8)
            r0.log(r3, r8)
            if (r1 == 0) goto L_0x0179
            r1.delete()
        L_0x0179:
            l.b.a.g.c r0 = new l.b.a.g.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.io.File r14 = r14.mo31269g()
            java.lang.String r14 = r14.getPath()
            r1[r7] = r14
            java.lang.String r14 = r2.getName()
            r1[r6] = r14
            java.lang.String r14 = r4.getMsg(r1)
            r0.<init>((java.lang.String) r14)
            throw r0
        L_0x0195:
            java.io.File r3 = r14.mo31269g()
            boolean r3 = p402l.p406b.p407a.p416i.C9057i.m48297B(r1, r3)
            if (r3 != 0) goto L_0x0218
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x01b8
            java.util.logging.Logger r0 = f35530b
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_NEW_FILE_DOESNT_EXIST
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r8 = r1.getAbsolutePath()
            r4[r7] = r8
            java.lang.String r3 = r3.getMsg(r4)
            r0.warning(r3)
        L_0x01b8:
            java.io.File r0 = r14.mo31269g()
            boolean r0 = r2.renameTo(r0)
            if (r0 != 0) goto L_0x01df
            java.util.logging.Logger r0 = f35530b
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_RENAME_ORIGINAL_BACKUP_TO_ORIGINAL
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r2 = r2.getAbsolutePath()
            r4[r7] = r2
            java.io.File r2 = r14.mo31269g()
            java.lang.String r2 = r2.getName()
            r4[r6] = r2
            java.lang.String r2 = r3.getMsg(r4)
            r0.warning(r2)
        L_0x01df:
            java.util.logging.Logger r0 = f35530b
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_RENAME_TO_ORIGINAL_FILE
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.io.File r4 = r14.mo31269g()
            java.lang.String r4 = r4.getAbsolutePath()
            r3[r7] = r4
            java.lang.String r4 = r1.getName()
            r3[r6] = r4
            java.lang.String r3 = r2.getMsg(r3)
            r0.warning(r3)
            l.b.a.g.c r0 = new l.b.a.g.c
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.io.File r14 = r14.mo31269g()
            java.lang.String r14 = r14.getAbsolutePath()
            r3[r7] = r14
            java.lang.String r14 = r1.getName()
            r3[r6] = r14
            java.lang.String r14 = r2.getMsg(r3)
            r0.<init>((java.lang.String) r14)
            throw r0
        L_0x0218:
            boolean r14 = r2.delete()
            if (r14 != 0) goto L_0x0231
            java.util.logging.Logger r14 = f35530b
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_WARNING_UNABLE_TO_DELETE_BACKUP_FILE
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r2 = r2.getAbsolutePath()
            r4[r7] = r2
            java.lang.String r2 = r3.getMsg(r4)
            r14.warning(r2)
        L_0x0231:
            boolean r14 = r1.exists()
            if (r14 == 0) goto L_0x026a
            boolean r14 = r1.delete()
            if (r14 != 0) goto L_0x026a
            java.util.logging.Logger r14 = f35530b
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r1 = r1.getPath()
            r3[r7] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r14.warning(r1)
            goto L_0x026a
        L_0x0251:
            boolean r14 = r1.delete()
            if (r14 != 0) goto L_0x026a
            java.util.logging.Logger r14 = f35530b
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r1 = r1.getPath()
            r3[r7] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r14.warning(r1)
        L_0x026a:
            l.b.a.i.c r14 = r13.f35531a
            if (r14 == 0) goto L_0x0271
            r14.mo31538d(r0)
        L_0x0271:
            return
        L_0x0272:
            r0 = move-exception
            l.b.a.g.c r4 = new l.b.a.g.c     // Catch:{ Exception -> 0x027b }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x027b }
            throw r4     // Catch:{ Exception -> 0x027b }
        L_0x0279:
            r0 = move-exception
            goto L_0x02f1
        L_0x027b:
            r0 = move-exception
            java.util.logging.Logger r4 = f35530b     // Catch:{ all -> 0x0279 }
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0279 }
            l.b.b.b r9 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_BECAUSE     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0279 }
            java.io.File r11 = r14.mo31269g()     // Catch:{ all -> 0x0279 }
            r10[r7] = r11     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = r0.getMessage()     // Catch:{ all -> 0x0279 }
            r10[r6] = r11     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = r9.getMsg(r10)     // Catch:{ all -> 0x0279 }
            r4.log(r8, r9, r0)     // Catch:{ all -> 0x0279 }
            r2.close()     // Catch:{ IOException -> 0x029e }
            r3.close()     // Catch:{ IOException -> 0x029e }
            goto L_0x02be
        L_0x029e:
            r4 = move-exception
            java.util.logging.Logger r8 = f35530b     // Catch:{ all -> 0x0279 }
            java.util.logging.Level r9 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0279 }
            l.b.b.b r10 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_PROBLEM_CLOSING_FILE_HANDLE     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0279 }
            java.io.File r12 = r14.mo31269g()     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ all -> 0x0279 }
            r11[r7] = r12     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r4.getMessage()     // Catch:{ all -> 0x0279 }
            r11[r6] = r12     // Catch:{ all -> 0x0279 }
            java.lang.String r10 = r10.getMsg(r11)     // Catch:{ all -> 0x0279 }
            r8.log(r9, r10, r4)     // Catch:{ all -> 0x0279 }
        L_0x02be:
            boolean r4 = r1.delete()     // Catch:{ all -> 0x0279 }
            if (r4 != 0) goto L_0x02d7
            java.util.logging.Logger r4 = f35530b     // Catch:{ all -> 0x0279 }
            l.b.b.b r8 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0279 }
            r9[r7] = r1     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = r8.getMsg(r9)     // Catch:{ all -> 0x0279 }
            r4.warning(r1)     // Catch:{ all -> 0x0279 }
        L_0x02d7:
            l.b.a.g.c r1 = new l.b.a.g.c     // Catch:{ all -> 0x0279 }
            l.b.b.b r4 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_BECAUSE     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0279 }
            java.io.File r9 = r14.mo31269g()     // Catch:{ all -> 0x0279 }
            r8[r7] = r9     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0279 }
            r8[r6] = r0     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r4.getMsg(r8)     // Catch:{ all -> 0x0279 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0279 }
            throw r1     // Catch:{ all -> 0x0279 }
        L_0x02f1:
            r2.close()     // Catch:{ IOException -> 0x02f8 }
            r3.close()     // Catch:{ IOException -> 0x02f8 }
            goto L_0x0318
        L_0x02f8:
            r1 = move-exception
            java.util.logging.Logger r2 = f35530b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            l.b.b.b r4 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_PROBLEM_CLOSING_FILE_HANDLE
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.io.File r14 = r14.mo31269g()
            java.lang.String r14 = r14.getAbsolutePath()
            r5[r7] = r14
            java.lang.String r14 = r1.getMessage()
            r5[r6] = r14
            java.lang.String r14 = r4.getMsg(r5)
            r2.log(r3, r14, r1)
        L_0x0318:
            throw r0
        L_0x0319:
            r0 = move-exception
            r2 = r3
            goto L_0x031d
        L_0x031c:
            r0 = move-exception
        L_0x031d:
            java.util.logging.Logger r3 = f35530b
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE
            l.b.b.b r8 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.io.File r10 = r14.mo31269g()
            java.lang.String r10 = r10.getAbsolutePath()
            r9[r7] = r10
            java.lang.String r8 = r8.getMsg(r9)
            r3.log(r4, r8, r0)
            if (r2 == 0) goto L_0x0358
            r2.close()     // Catch:{ IOException -> 0x033c }
            goto L_0x0358
        L_0x033c:
            r2 = move-exception
            java.util.logging.Logger r3 = f35530b
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            l.b.b.b r8 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_PROBLEM_CLOSING_FILE_HANDLE
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.io.File r9 = r14.mo31269g()
            r5[r7] = r9
            java.lang.String r0 = r0.getMessage()
            r5[r6] = r0
            java.lang.String r0 = r8.getMsg(r5)
            r3.log(r4, r0, r2)
        L_0x0358:
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x0371
            java.util.logging.Logger r0 = f35530b
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_DELETE_TEMPORARY_FILE
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r1 = r1.getAbsolutePath()
            r3[r7] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r0.warning(r1)
        L_0x0371:
            l.b.a.g.c r0 = new l.b.a.g.c
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.io.File r14 = r14.mo31269g()
            java.lang.String r14 = r14.getAbsolutePath()
            r2[r7] = r14
            java.lang.String r14 = r1.getMsg(r2)
            r0.<init>((java.lang.String) r14)
            throw r0
        L_0x0389:
            r0 = move-exception
            java.util.logging.Logger r1 = f35530b
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            l.b.b.b r3 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.io.File r8 = r14.mo31269g()
            java.lang.String r8 = r8.getName()
            r4[r7] = r8
            java.io.File r8 = r14.mo31269g()
            java.io.File r8 = r8.getParentFile()
            java.lang.String r8 = r8.getAbsolutePath()
            r4[r6] = r8
            java.lang.String r4 = r3.getMsg(r4)
            r1.log(r2, r4, r0)
            l.b.a.g.c r0 = new l.b.a.g.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.io.File r2 = r14.mo31269g()
            java.lang.String r2 = r2.getName()
            r1[r7] = r2
            java.io.File r14 = r14.mo31269g()
            java.io.File r14 = r14.getParentFile()
            java.lang.String r14 = r14.getAbsolutePath()
            r1[r6] = r14
            java.lang.String r14 = r3.getMsg(r1)
            r0.<init>((java.lang.String) r14)
            throw r0
        L_0x03d5:
            java.util.logging.Logger r0 = f35530b
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.io.File r4 = r14.mo31269g()
            java.lang.String r4 = r4.getName()
            r3[r7] = r4
            java.io.File r4 = r14.mo31269g()
            java.io.File r4 = r4.getParentFile()
            java.lang.String r4 = r4.getAbsolutePath()
            r3[r6] = r4
            java.lang.String r3 = r2.getMsg(r3)
            r0.log(r1, r3, r8)
            l.b.a.g.c r0 = new l.b.a.g.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.io.File r3 = r14.mo31269g()
            java.lang.String r3 = r3.getName()
            r1[r7] = r3
            java.io.File r14 = r14.mo31269g()
            java.io.File r14 = r14.getParentFile()
            java.lang.String r14 = r14.getAbsolutePath()
            r1[r6] = r14
            java.lang.String r14 = r2.getMsg(r1)
            r0.<init>((java.lang.String) r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p416i.C9052e.mo31541e(l.b.a.a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo31301f(C9130j jVar, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9015a, C9017c, IOException;
}
