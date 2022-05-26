package p402l.p406b.p407a.p418k;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p407a.p418k.p419j.C9082f;
import p402l.p406b.p407a.p418k.p419j.C9090m;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p435v.C9271c;
import p402l.p406b.p426c.p435v.C9272d;
import p402l.p406b.p441d.p442b.C9301a;

/* renamed from: l.b.a.k.i */
/* compiled from: Mp4TagWriter */
public class C9074i {

    /* renamed from: b */
    public static Logger f35626b = Logger.getLogger("org.jaudiotagger.tag.mp4");

    /* renamed from: a */
    private C9272d f35627a = new C9272d();

    /* renamed from: a */
    private void m48431a(C9077c cVar, ByteBuffer byteBuffer, int i, C9077c cVar2, C9077c cVar3) throws IOException {
        cVar.mo31646j(cVar.mo31644f() + i);
        if (cVar2 != null) {
            cVar2.mo31646j(cVar2.mo31644f() + i);
            byteBuffer.position((int) ((cVar2.mo31641c() - cVar.mo31641c()) - 8));
            byteBuffer.put(cVar2.mo31642d());
        }
        if (cVar3 != null) {
            cVar3.mo31646j(cVar3.mo31644f() + i);
            byteBuffer.position((int) ((cVar3.mo31641c() - cVar.mo31641c()) - 8));
            byteBuffer.put(cVar3.mo31642d());
        }
    }

    /* renamed from: b */
    private void m48432b(RandomAccessFile randomAccessFile, C9077c cVar, FileChannel fileChannel, C9090m mVar) throws C9017c, IOException {
        f35626b.config("Checking file has been written correctly");
        try {
            C9068c cVar2 = new C9068c(randomAccessFile, false);
            C9077c c = cVar2.mo31613c(cVar2.mo31617g());
            if (c == null) {
                throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED_NO_DATA.getMsg());
            } else if (c.mo31644f() != cVar.mo31644f()) {
                throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED_DATA_CORRUPT.getMsg());
            } else if (cVar2.mo31613c(cVar2.mo31624n()) == null) {
                throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED_NO_TAG_DATA.getMsg());
            } else if (cVar2.mo31613c(cVar2.mo31618h()) != null) {
                C9090m k = cVar2.mo31621k();
                Logger logger = f35626b;
                logger.finer("stco:Original First Offset" + mVar.mo31669d());
                Logger logger2 = f35626b;
                logger2.finer("stco:Original Diff" + ((int) (((long) mVar.mo31669d()) - cVar.mo31641c())));
                Logger logger3 = f35626b;
                logger3.finer("stco:Original Mdat Pos" + cVar.mo31641c());
                Logger logger4 = f35626b;
                logger4.finer("stco:New First Offset" + k.mo31669d());
                Logger logger5 = f35626b;
                logger5.finer("stco:New Diff" + ((int) (((long) k.mo31669d()) - c.mo31641c())));
                Logger logger6 = f35626b;
                logger6.finer("stco:New Mdat Pos" + c.mo31641c());
                int d = (int) (((long) mVar.mo31669d()) - cVar.mo31641c());
                long j = (long) d;
                if (((long) k.mo31669d()) - c.mo31641c() == j) {
                    randomAccessFile.close();
                    fileChannel.close();
                    f35626b.config("File has been written correctly");
                    return;
                }
                throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED_INCORRECT_OFFSETS.getMsg(Integer.valueOf((int) ((((long) k.mo31669d()) - c.mo31641c()) - j))));
            } else {
                throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED_NO_TAG_DATA.getMsg());
            }
        } catch (Exception e) {
            if (e instanceof C9017c) {
                throw ((C9017c) e);
            }
            e.printStackTrace();
            throw new C9017c(C9118b.MP4_CHANGES_TO_FILE_FAILED.getMsg() + ":" + e.getMessage());
        } catch (Throwable th) {
            randomAccessFile.close();
            fileChannel.close();
            throw th;
        }
    }

    /* renamed from: c */
    private void m48433c(FileChannel fileChannel, C9077c cVar) throws IOException {
        C9082f fVar = new C9082f(cVar.mo31639a());
        fileChannel.write(fVar.mo31633b().mo31642d());
        fileChannel.write(fVar.mo31632a());
    }

    /* renamed from: e */
    private int m48434e(C9068c cVar) {
        for (C9301a next : cVar.mo31614d()) {
            C9301a aVar = (C9301a) next.getParent();
            C9301a previousSibling = next.getPreviousSibling();
            if (!aVar.isRoot()) {
                C9077c cVar2 = (C9077c) aVar.getUserObject();
                C9077c cVar3 = (C9077c) next.getUserObject();
                if (previousSibling != null) {
                    C9077c cVar4 = (C9077c) previousSibling.getUserObject();
                    if (cVar2.mo31643e().equals(C9067b.META.getFieldName()) && cVar4.mo31643e().equals(C9067b.ILST.getFieldName())) {
                        return cVar3.mo31644f();
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private void m48435g(FileChannel fileChannel, FileChannel fileChannel2, C9077c cVar) throws IOException, C9017c {
        if (cVar != null) {
            m48439k(fileChannel, fileChannel2, cVar);
        } else {
            m48436h(fileChannel, fileChannel2);
        }
    }

    /* renamed from: h */
    private void m48436h(FileChannel fileChannel, FileChannel fileChannel2) throws IOException, C9017c {
        long size = fileChannel.size() - fileChannel.position();
        long m = C9134n.m48562h().mo31742m();
        long j = size / m;
        long j2 = size % m;
        long j3 = 0;
        for (int i = 0; ((long) i) < j; i++) {
            j3 += fileChannel2.transferFrom(fileChannel, fileChannel2.position(), m);
            fileChannel2.position(fileChannel2.position() + m);
        }
        FileChannel fileChannel3 = fileChannel2;
        long transferFrom = fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j2) + j3;
        if (transferFrom != size) {
            throw new C9017c("Was meant to write " + size + " bytes but only written " + transferFrom + " bytes");
        }
    }

    /* renamed from: i */
    private void m48437i(FileChannel fileChannel, FileChannel fileChannel2, int i, int i2, ByteBuffer byteBuffer) throws IOException {
        fileChannel.position(0);
        long j = (long) i2;
        fileChannel2.transferFrom(fileChannel, 0, j);
        fileChannel2.position(j);
        fileChannel2.write(byteBuffer);
        fileChannel.position((long) (i2 + i));
    }

    /* renamed from: j */
    private void m48438j(ByteBuffer byteBuffer, long j, long j2, FileChannel fileChannel, FileChannel fileChannel2, C9077c cVar) throws C9017c, IOException {
        FileChannel fileChannel3 = fileChannel;
        FileChannel fileChannel4 = fileChannel2;
        fileChannel3.position(0);
        fileChannel2.transferFrom(fileChannel, 0, j2);
        fileChannel4.position(j2);
        ByteBuffer byteBuffer2 = byteBuffer;
        fileChannel4.write(byteBuffer);
        fileChannel3.position(j2 + j);
        m48435g(fileChannel3, fileChannel4, cVar);
    }

    /* renamed from: k */
    private void m48439k(FileChannel fileChannel, FileChannel fileChannel2, C9077c cVar) throws IOException, C9017c {
        long c = cVar.mo31641c() - fileChannel.position();
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), c);
        fileChannel2.position(fileChannel2.position() + c);
        m48433c(fileChannel2, cVar);
        fileChannel.position(cVar.mo31641c() + ((long) cVar.mo31644f()));
        m48436h(fileChannel, fileChannel2);
    }

    /* renamed from: d */
    public void mo31630d(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        try {
            mo31631f(new C9271c(), randomAccessFile, randomAccessFile2);
        } catch (C9017c e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x015b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a4  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31631f(p402l.p406b.p426c.C9130j r34, java.io.RandomAccessFile r35, java.io.RandomAccessFile r36) throws p402l.p406b.p407a.p413g.C9017c, java.io.IOException {
        /*
            r33 = this;
            r10 = r33
            java.util.logging.Logger r0 = f35626b
            java.lang.String r1 = "Started writing tag data"
            r0.config(r1)
            java.nio.channels.FileChannel r0 = r35.getChannel()
            java.nio.channels.FileChannel r11 = r36.getChannel()
            l.b.a.k.c r1 = new l.b.a.k.c     // Catch:{ a -> 0x05e3 }
            r2 = 0
            r12 = r35
            r1.<init>(r12, r2)     // Catch:{ a -> 0x05e3 }
            l.b.d.b.a r3 = r1.mo31617g()
            l.b.a.k.j.c r13 = r1.mo31613c(r3)
            if (r13 == 0) goto L_0x05d6
            l.b.c.v.d r3 = r10.f35627a
            r4 = r34
            java.nio.ByteBuffer r8 = r3.mo31534a(r4)
            r8.rewind()
            int r7 = r8.limit()
            l.b.d.b.a r3 = r1.mo31620j()
            l.b.a.k.j.c r9 = r1.mo31613c(r3)
            long r3 = r9.mo31641c()
            r5 = 8
            long r3 = r3 + r5
            long r14 = r9.mo31641c()
            int r5 = r9.mo31644f()
            long r5 = (long) r5
            long r14 = r14 + r5
            l.b.a.k.j.m r5 = r1.mo31621k()
            l.b.d.b.a r6 = r1.mo31616f()
            l.b.a.k.j.c r6 = r1.mo31613c(r6)
            l.b.d.b.a r2 = r1.mo31624n()
            l.b.a.k.j.c r19 = r1.mo31613c(r2)
            l.b.d.b.a r2 = r1.mo31618h()
            l.b.a.k.j.c r20 = r1.mo31613c(r2)
            l.b.d.b.a r2 = r1.mo31615e()
            l.b.a.k.j.c r2 = r1.mo31613c(r2)
            r34 = r5
            l.b.d.b.a r5 = r1.mo31622l()
            l.b.a.k.j.c r5 = r1.mo31613c(r5)
            r21 = r5
            java.util.List r5 = r1.mo31623m()
            r12 = 0
            java.lang.Object r5 = r5.get(r12)
            l.b.d.b.a r5 = (p402l.p406b.p441d.p442b.C9301a) r5
            l.b.a.k.j.c r5 = r1.mo31613c(r5)
            java.nio.ByteBuffer r12 = r1.mo31619i()
            if (r19 == 0) goto L_0x00ed
            if (r20 == 0) goto L_0x00dc
            if (r6 == 0) goto L_0x00b0
            int r2 = r6.mo31644f()
            long r5 = r6.mo31641c()
            int r6 = (int) r5
            r22 = r14
            long r14 = (long) r6
            long r24 = r9.mo31641c()
            r16 = 8
            long r24 = r24 + r16
            long r14 = r14 - r24
            int r5 = (int) r14
            r14 = r2
            r15 = r6
        L_0x00ad:
            r6 = r5
            goto L_0x0120
        L_0x00b0:
            r22 = r14
            r16 = 8
            if (r2 == 0) goto L_0x00cd
            long r5 = r2.mo31641c()
            int r6 = (int) r5
            int r2 = r2.mo31644f()
            int r6 = r6 + r2
            long r14 = (long) r6
            long r24 = r9.mo31641c()
            long r24 = r24 + r16
            long r14 = r14 - r24
            int r5 = (int) r14
            r15 = r6
            r14 = 0
            goto L_0x00ad
        L_0x00cd:
            long r5 = r20.mo31641c()
            int r2 = (int) r5
            int r2 = r2 + 8
            int r2 = r2 + 4
            long r5 = (long) r2
            long r14 = r9.mo31641c()
            goto L_0x0102
        L_0x00dc:
            r22 = r14
            int r2 = r9.mo31644f()
            int r5 = r2 + -8
            long r14 = r9.mo31641c()
            int r2 = r9.mo31644f()
            goto L_0x0117
        L_0x00ed:
            r22 = r14
            if (r20 == 0) goto L_0x0109
            long r14 = r5.mo31641c()
            int r2 = (int) r14
            int r5 = r5.mo31644f()
            int r2 = r2 + r5
            long r5 = (long) r2
            long r14 = r9.mo31641c()
            r16 = 8
        L_0x0102:
            long r14 = r14 + r16
            long r5 = r5 - r14
            int r5 = (int) r5
            r15 = r2
            r6 = r5
            goto L_0x011f
        L_0x0109:
            int r2 = r9.mo31644f()
            int r5 = r2 + -8
            long r14 = r9.mo31641c()
            int r2 = r9.mo31644f()
        L_0x0117:
            r24 = r5
            long r5 = (long) r2
            long r14 = r14 + r5
            int r2 = (int) r14
            r15 = r2
            r6 = r24
        L_0x011f:
            r14 = 0
        L_0x0120:
            int r5 = r10.m48434e(r1)
            java.util.List r1 = r1.mo31614d()
            java.util.Iterator r1 = r1.iterator()
        L_0x012c:
            boolean r24 = r1.hasNext()
            if (r24 == 0) goto L_0x015b
            java.lang.Object r24 = r1.next()
            l.b.d.b.a r24 = (p402l.p406b.p441d.p442b.C9301a) r24
            l.b.d.b.g r25 = r24.getParent()
            l.b.d.b.a r25 = (p402l.p406b.p441d.p442b.C9301a) r25
            boolean r25 = r25.isRoot()
            if (r25 == 0) goto L_0x0158
            java.lang.Object r1 = r24.getUserObject()
            l.b.a.k.j.c r1 = (p402l.p406b.p407a.p418k.p419j.C9077c) r1
            int r24 = r1.mo31644f()
            r25 = r3
            long r2 = r1.mo31641c()
            int r1 = (int) r2
            r3 = r24
            goto L_0x015f
        L_0x0158:
            r25 = r3
            goto L_0x012c
        L_0x015b:
            r25 = r3
            r1 = 0
            r3 = 0
        L_0x015f:
            if (r3 <= 0) goto L_0x0178
            r24 = r5
            long r4 = (long) r1
            long r27 = r13.mo31641c()
            int r29 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r29 <= 0) goto L_0x016f
        L_0x016c:
            r18 = 0
            goto L_0x0181
        L_0x016f:
            long r27 = r9.mo31641c()
            int r29 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r29 >= 0) goto L_0x017f
            goto L_0x016c
        L_0x0178:
            r24 = r5
            long r4 = r13.mo31641c()
            int r1 = (int) r4
        L_0x017f:
            r18 = 1
        L_0x0181:
            java.util.logging.Logger r2 = f35626b
            java.lang.String r4 = "Read header successfully ready for writing"
            r2.config(r4)
            if (r14 != r7) goto L_0x01a4
            java.util.logging.Logger r1 = f35626b
            java.lang.String r2 = "Writing:Option 1:Same Size"
            r1.config(r2)
            long r3 = (long) r14
            long r5 = (long) r15
            r1 = r33
            r2 = r8
            r12 = r34
            r9 = r21
            r7 = r0
            r8 = r11
            r1.m48438j(r2, r3, r5, r7, r8, r9)
        L_0x019f:
            r8 = r0
            r14 = r10
            r10 = r12
            goto L_0x05ca
        L_0x01a4:
            r5 = r34
            r34 = r1
            r4 = r21
            r1 = 0
            if (r14 <= r7) goto L_0x02b1
            if (r24 <= 0) goto L_0x0206
            java.util.logging.Logger r1 = f35626b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing:Option 2:Smaller Size have free atom:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.config(r2)
            r1 = r33
            r2 = r0
            r3 = r11
            r9 = r4
            r4 = r14
            r12 = r5
            r6 = r24
            r5 = r15
            r15 = r6
            r6 = r8
            r1.m48437i(r2, r3, r4, r5, r6)
            int r14 = r14 - r7
            int r5 = r15 + r14
            l.b.a.k.j.f r1 = new l.b.a.k.j.f
            int r5 = r5 + -8
            r1.<init>(r5)
            l.b.a.k.j.c r2 = r1.mo31633b()
            java.nio.ByteBuffer r2 = r2.mo31642d()
            r11.write(r2)
            java.nio.ByteBuffer r1 = r1.mo31632a()
            r11.write(r1)
            long r1 = r0.position()
            long r3 = (long) r15
            long r1 = r1 + r3
            r0.position(r1)
            r10.m48435g(r0, r11, r9)
            goto L_0x019f
        L_0x0206:
            int r7 = r14 - r7
            int r3 = r7 + -8
            if (r3 <= 0) goto L_0x023f
            java.util.logging.Logger r1 = f35626b
            java.lang.String r2 = "Writing:Option 3:Smaller Size can create free atom"
            r1.config(r2)
            r1 = r33
            r2 = r0
            r7 = r3
            r3 = r11
            r9 = r4
            r4 = r14
            r12 = r5
            r5 = r15
            r6 = r8
            r1.m48437i(r2, r3, r4, r5, r6)
            l.b.a.k.j.f r1 = new l.b.a.k.j.f
            r1.<init>(r7)
            l.b.a.k.j.c r2 = r1.mo31633b()
            java.nio.ByteBuffer r2 = r2.mo31642d()
            r11.write(r2)
            java.nio.ByteBuffer r1 = r1.mo31632a()
            r11.write(r1)
            r10.m48435g(r0, r11, r9)
            r6 = r0
            r5 = r10
            r10 = r12
            goto L_0x02ad
        L_0x023f:
            r32 = r5
            r5 = r4
            r4 = r32
            java.util.logging.Logger r3 = f35626b
            r34 = r4
            java.lang.String r4 = "Writing:Option 4:Smaller Size <=8 cannot create free atoms"
            r3.config(r4)
            r0.position(r1)
            r16 = 0
            long r21 = r9.mo31641c()
            r2 = r11
            r3 = r0
            r1 = r34
            r10 = r5
            r4 = r16
            r24 = r0
            r0 = r6
            r34 = r10
            r10 = r7
            r6 = r21
            r2.transferFrom(r3, r4, r6)
            long r2 = r9.mo31641c()
            r11.position(r2)
            long r2 = r13.mo31641c()
            long r4 = r9.mo31641c()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x027f
            int r2 = -r10
            r1.mo31668c(r2)
        L_0x027f:
            int r4 = -r10
            r10 = r1
            r1 = r33
            r2 = r9
            r3 = r12
            r5 = r19
            r6 = r20
            r1.m48431a(r2, r3, r4, r5, r6)
            java.nio.ByteBuffer r1 = r9.mo31642d()
            r11.write(r1)
            r12.rewind()
            r12.limit(r0)
            r11.write(r12)
            r11.write(r8)
            int r15 = r15 + r14
            long r0 = (long) r15
            r6 = r24
            r6.position(r0)
            r5 = r33
            r4 = r34
            r5.m48435g(r6, r11, r4)
        L_0x02ad:
            r14 = r5
            r8 = r6
            goto L_0x05ca
        L_0x02b1:
            r21 = r6
            r6 = r0
            r0 = r24
            r32 = r10
            r10 = r5
            r5 = r32
            int r7 = r7 - r14
            int r1 = r0 + -8
            if (r7 > r1) goto L_0x0313
            int r7 = r0 - r7
            java.util.logging.Logger r1 = f35626b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing:Option 5;Larger Size can use meta free atom need extra:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "bytes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.config(r2)
            r1 = r33
            r2 = r6
            r3 = r11
            r9 = r4
            r4 = r14
            r12 = r5
            r5 = r15
            r14 = r6
            r6 = r8
            r1.m48437i(r2, r3, r4, r5, r6)
            l.b.a.k.j.f r1 = new l.b.a.k.j.f
            int r7 = r7 + -8
            r1.<init>(r7)
            l.b.a.k.j.c r2 = r1.mo31633b()
            java.nio.ByteBuffer r2 = r2.mo31642d()
            r11.write(r2)
            java.nio.ByteBuffer r1 = r1.mo31632a()
            r11.write(r1)
            long r1 = r14.position()
            long r3 = (long) r0
            long r1 = r1 + r3
            r14.position(r1)
            r12.m48435g(r14, r11, r9)
            r8 = r14
            r14 = r12
            goto L_0x05ca
        L_0x0313:
            r1 = r5
            int r7 = r7 - r0
            r1 = 0
            r6.position(r1)
            r27 = 0
            r1 = 8
            long r1 = r25 - r1
            r16 = r1
            r2 = r11
            r1 = r3
            r3 = r6
            r30 = r4
            r4 = r27
            r24 = r0
            r31 = r6
            r0 = r7
            r6 = r16
            r2.transferFrom(r3, r4, r6)
            r3 = r16
            r11.position(r3)
            java.lang.String r2 = "Adjusting Offsets"
            if (r19 != 0) goto L_0x03e7
            java.util.logging.Logger r3 = f35626b
            java.lang.String r4 = "Writing:Option 5.1;No udta atom"
            r3.config(r4)
            l.b.a.k.j.h r3 = p402l.p406b.p407a.p418k.p419j.C9084h.m48467c()
            l.b.a.k.j.c r4 = r3.mo31633b()
            int r4 = r4.mo31644f()
            int r5 = r8.limit()
            int r4 = r4 + r5
            l.b.a.k.j.j r4 = p402l.p406b.p407a.p418k.p419j.C9087j.m48469c(r4)
            l.b.a.k.j.c r5 = new l.b.a.k.j.c
            l.b.a.k.b r6 = p402l.p406b.p407a.p418k.C9067b.UDTA
            java.lang.String r6 = r6.getFieldName()
            r5.<init>((java.lang.String) r6)
            l.b.a.k.j.c r6 = r4.mo31633b()
            int r6 = r6.mo31644f()
            int r6 = r6 + 8
            r5.mo31646j(r6)
            int r6 = r5.mo31644f()
            int r7 = r8.limit()
            int r6 = r6 - r7
            int r7 = r0 + r6
            if (r18 == 0) goto L_0x0383
            int r0 = r1 + -8
            if (r0 >= r7) goto L_0x0397
            if (r1 == r7) goto L_0x0397
        L_0x0383:
            long r16 = r13.mo31641c()
            long r19 = r9.mo31641c()
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0397
            java.util.logging.Logger r0 = f35626b
            r0.config(r2)
            r10.mo31668c(r7)
        L_0x0397:
            int r0 = r9.mo31644f()
            int r0 = r0 + r7
            r9.mo31646j(r0)
            java.nio.ByteBuffer r0 = r9.mo31642d()
            r11.write(r0)
            r12.rewind()
            r6 = r21
            r12.limit(r6)
            r11.write(r12)
            java.nio.ByteBuffer r0 = r5.mo31642d()
            r11.write(r0)
            l.b.a.k.j.c r0 = r4.mo31633b()
            java.nio.ByteBuffer r0 = r0.mo31642d()
            r11.write(r0)
            java.nio.ByteBuffer r0 = r4.mo31632a()
            r11.write(r0)
            l.b.a.k.j.c r0 = r3.mo31633b()
            java.nio.ByteBuffer r0 = r0.mo31642d()
            r11.write(r0)
            java.nio.ByteBuffer r0 = r3.mo31632a()
            r11.write(r0)
            r0 = r34
            r16 = r1
            r1 = r7
            r17 = r14
            r14 = r33
            goto L_0x04e2
        L_0x03e7:
            r6 = r21
            if (r20 != 0) goto L_0x0499
            java.util.logging.Logger r3 = f35626b
            java.lang.String r4 = "Writing:Option 5.2;No meta atom"
            r3.config(r4)
            int r3 = r19.mo31644f()
            l.b.a.k.j.h r4 = p402l.p406b.p407a.p418k.p419j.C9084h.m48467c()
            l.b.a.k.j.c r5 = r4.mo31633b()
            int r5 = r5.mo31644f()
            int r7 = r8.limit()
            int r5 = r5 + r7
            l.b.a.k.j.j r5 = p402l.p406b.p407a.p418k.p419j.C9087j.m48469c(r5)
            l.b.a.k.j.c r7 = new l.b.a.k.j.c
            l.b.a.k.b r16 = p402l.p406b.p407a.p418k.C9067b.UDTA
            r17 = r14
            java.lang.String r14 = r16.getFieldName()
            r7.<init>((java.lang.String) r14)
            l.b.a.k.j.c r14 = r5.mo31633b()
            int r14 = r14.mo31644f()
            int r14 = r14 + 8
            r7.mo31646j(r14)
            int r14 = r7.mo31644f()
            int r16 = r8.limit()
            int r14 = r14 - r16
            int r0 = r0 + r14
            if (r18 == 0) goto L_0x0438
            int r14 = r1 + -8
            if (r14 >= r0) goto L_0x044c
            if (r1 == r0) goto L_0x044c
        L_0x0438:
            long r19 = r13.mo31641c()
            long r25 = r9.mo31641c()
            int r14 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r14 <= 0) goto L_0x044c
            java.util.logging.Logger r14 = f35626b
            r14.config(r2)
            r10.mo31668c(r0)
        L_0x044c:
            int r2 = r9.mo31644f()
            int r2 = r2 - r3
            int r2 = r2 + r0
            r9.mo31646j(r2)
            java.nio.ByteBuffer r2 = r9.mo31642d()
            r11.write(r2)
            r12.rewind()
            int r6 = r6 - r3
            r12.limit(r6)
            r11.write(r12)
            java.nio.ByteBuffer r2 = r7.mo31642d()
            r11.write(r2)
            l.b.a.k.j.c r2 = r5.mo31633b()
            java.nio.ByteBuffer r2 = r2.mo31642d()
            r11.write(r2)
            java.nio.ByteBuffer r2 = r5.mo31632a()
            r11.write(r2)
            l.b.a.k.j.c r2 = r4.mo31633b()
            java.nio.ByteBuffer r2 = r2.mo31642d()
            r11.write(r2)
            java.nio.ByteBuffer r2 = r4.mo31632a()
            r11.write(r2)
            r14 = r33
            r16 = r1
            r1 = r0
            r0 = r34
            goto L_0x04e2
        L_0x0499:
            r17 = r14
            java.util.logging.Logger r2 = f35626b
            java.lang.String r3 = "Writing:Option 5.3;udta atom exists"
            r2.config(r3)
            if (r18 == 0) goto L_0x04aa
            int r3 = r1 + -8
            if (r3 >= r0) goto L_0x04b9
            if (r1 == r0) goto L_0x04b9
        L_0x04aa:
            long r2 = r13.mo31641c()
            long r4 = r9.mo31641c()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x04b9
            r10.mo31668c(r0)
        L_0x04b9:
            r14 = r33
            r5 = r34
            r7 = r1
            r1 = r33
            r2 = r9
            r3 = r12
            r4 = r0
            r34 = r0
            r0 = r5
            r5 = r19
            r16 = r7
            r7 = r6
            r6 = r20
            r1.m48431a(r2, r3, r4, r5, r6)
            java.nio.ByteBuffer r1 = r9.mo31642d()
            r11.write(r1)
            r12.rewind()
            r12.limit(r7)
            r11.write(r12)
            r1 = r34
        L_0x04e2:
            r11.write(r8)
            int r2 = r15 + r17
            long r2 = (long) r2
            r8 = r31
            r8.position(r2)
            long r2 = r8.position()
            r4 = r24
            long r4 = (long) r4
            long r2 = r2 + r4
            r8.position(r2)
            r9 = r30
            if (r9 == 0) goto L_0x053c
            long r2 = r9.mo31641c()
            long r4 = r8.position()
            long r19 = r2 - r4
            long r4 = r11.position()
            r2 = r11
            r3 = r8
            r12 = r16
            r6 = r19
            r2.transferFrom(r3, r4, r6)
            long r2 = r11.position()
            long r2 = r2 + r19
            r11.position(r2)
            r14.m48433c(r11, r9)
            long r2 = r9.mo31641c()
            int r4 = r9.mo31644f()
            long r4 = (long) r4
            long r2 = r2 + r4
            r8.position(r2)
            long r2 = r8.position()
            long r6 = r22 - r2
            long r4 = r11.position()
            r2 = r11
            r3 = r8
            r2.transferFrom(r3, r4, r6)
            goto L_0x0558
        L_0x053c:
            r12 = r16
            long r2 = r8.position()
            long r16 = r22 - r2
            long r4 = r11.position()
            r2 = r11
            r3 = r8
            r6 = r16
            r2.transferFrom(r3, r4, r6)
            long r2 = r11.position()
            long r2 = r2 + r16
            r11.position(r2)
        L_0x0558:
            if (r18 == 0) goto L_0x05c0
            if (r0 < r15) goto L_0x05c0
            int r3 = r12 + -8
            if (r3 < r1) goto L_0x058c
            java.util.logging.Logger r0 = f35626b
            java.lang.String r2 = "Writing:Option 6;Larger Size can use top free atom"
            r0.config(r2)
            l.b.a.k.j.f r0 = new l.b.a.k.j.f
            int r3 = r3 - r1
            r0.<init>(r3)
            l.b.a.k.j.c r1 = r0.mo31633b()
            java.nio.ByteBuffer r1 = r1.mo31642d()
            r11.write(r1)
            java.nio.ByteBuffer r0 = r0.mo31632a()
            r11.write(r0)
            long r0 = r8.position()
            long r2 = (long) r12
            long r0 = r0 + r2
            r8.position(r0)
            r14.m48436h(r8, r11)
            goto L_0x05ca
        L_0x058c:
            if (r12 != r1) goto L_0x05a2
            java.util.logging.Logger r0 = f35626b
            java.lang.String r1 = "Writing:Option 7;Larger Size uses top free atom including header"
            r0.config(r1)
            long r0 = r8.position()
            long r2 = (long) r12
            long r0 = r0 + r2
            r8.position(r0)
            r14.m48436h(r8, r11)
            goto L_0x05ca
        L_0x05a2:
            java.util.logging.Logger r0 = f35626b
            java.lang.String r1 = "Writing:Option 8;Larger Size cannot use top free atom"
            r0.config(r1)
            long r4 = r11.position()
            long r0 = r8.size()
            long r2 = r8.position()
            long r6 = r0 - r2
            r2 = r11
            r3 = r8
            r2.transferFrom(r3, r4, r6)
            r14.m48436h(r8, r11)
            goto L_0x05ca
        L_0x05c0:
            java.util.logging.Logger r0 = f35626b
            java.lang.String r1 = "Writing:Option 9;Top Level Free comes after Mdat or before Metadata so cant use it"
            r0.config(r1)
            r14.m48436h(r8, r11)
        L_0x05ca:
            r8.close()
            r35.close()
            r0 = r36
            r14.m48432b(r0, r13, r11, r10)
            return
        L_0x05d6:
            r14 = r10
            l.b.a.g.c r0 = new l.b.a.g.c
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.MP4_CHANGES_TO_FILE_FAILED_CANNOT_FIND_AUDIO
            java.lang.String r1 = r1.getMsg()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05e3:
            r0 = move-exception
            r14 = r10
            l.b.a.g.c r1 = new l.b.a.g.c
            java.lang.String r0 = r0.getMessage()
            r1.<init>((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p418k.C9074i.mo31631f(l.b.c.j, java.io.RandomAccessFile, java.io.RandomAccessFile):void");
    }
}
