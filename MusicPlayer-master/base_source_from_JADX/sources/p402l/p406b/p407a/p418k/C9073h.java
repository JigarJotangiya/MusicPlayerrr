package p402l.p406b.p407a.p418k;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p407a.p418k.p419j.C9087j;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.C9270b;
import p402l.p406b.p426c.p435v.C9271c;
import p402l.p406b.p426c.p435v.p437h.C9278a;
import p402l.p406b.p426c.p435v.p437h.C9279b;
import p402l.p406b.p426c.p435v.p437h.C9280c;
import p402l.p406b.p426c.p435v.p437h.C9281d;
import p402l.p406b.p426c.p435v.p437h.C9282e;
import p402l.p406b.p426c.p435v.p437h.C9283f;
import p402l.p406b.p426c.p435v.p437h.C9284g;
import p402l.p406b.p426c.p435v.p437h.C9285h;
import p402l.p406b.p426c.p435v.p437h.C9286i;
import p402l.p406b.p426c.p435v.p437h.C9287j;
import p402l.p406b.p426c.p435v.p437h.C9288k;

/* renamed from: l.b.a.k.h */
/* compiled from: Mp4TagReader */
public class C9073h {

    /* renamed from: a */
    public static Logger f35625a = Logger.getLogger("org.jaudiotagger.tag.mp4");

    /* renamed from: a */
    private void m48429a(C9271c cVar, C9077c cVar2, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        if (cVar2.mo31639a() != 0) {
            int i = 0;
            if (cVar2.mo31643e().equals("----")) {
                try {
                    cVar.mo31522f(new C9285h(cVar2, byteBuffer));
                } catch (Exception e) {
                    f35625a.warning(C9118b.MP4_UNABLE_READ_REVERSE_DNS_FIELD.getMsg(e.getMessage()));
                    cVar.mo31522f(new C9284g(cVar2, byteBuffer));
                }
            } else {
                int position = byteBuffer.position();
                boolean equals = C9057i.m48313p(byteBuffer, 4, 4, "ISO-8859-1").equals("data");
                byteBuffer.position(position);
                if (equals) {
                    int e2 = C9057i.m48302e(byteBuffer, 9, 11);
                    C9279b fieldType = C9279b.getFieldType(e2);
                    Logger logger = f35625a;
                    logger.config("Box Type id:" + cVar2.mo31643e() + ":type:" + fieldType);
                    if (cVar2.mo31643e().equals(C9269a.TRACK.getFieldName())) {
                        cVar.mo31522f(new C9288k(cVar2.mo31643e(), byteBuffer));
                    } else if (cVar2.mo31643e().equals(C9269a.DISCNUMBER.getFieldName())) {
                        cVar.mo31522f(new C9278a(cVar2.mo31643e(), byteBuffer));
                    } else if (cVar2.mo31643e().equals(C9269a.GENRE.getFieldName())) {
                        cVar.mo31522f(new C9280c(cVar2.mo31643e(), byteBuffer));
                    } else if (cVar2.mo31643e().equals(C9269a.ARTWORK.getFieldName()) || C9279b.isCoverArtType(fieldType)) {
                        int i2 = 0;
                        while (i < cVar2.mo31639a()) {
                            if (i2 > 0) {
                                int i3 = i + 9;
                                fieldType = C9279b.getFieldType(C9057i.m48302e(byteBuffer, i3, (i3 + 3) - 1));
                            }
                            C9283f fVar = new C9283f(byteBuffer, fieldType);
                            cVar.mo31522f(fVar);
                            i += fVar.mo32130g();
                            i2++;
                        }
                    } else if (fieldType == C9279b.TEXT) {
                        cVar.mo31522f(new C9286i(cVar2.mo31643e(), byteBuffer));
                    } else if (fieldType == C9279b.IMPLICIT) {
                        cVar.mo31522f(new C9287j(cVar2.mo31643e(), byteBuffer));
                    } else if (fieldType == C9279b.INTEGER) {
                        cVar.mo31522f(new C9282e(cVar2.mo31643e(), byteBuffer));
                    } else {
                        C9269a[] values = C9269a.values();
                        int length = values.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            } else if (values[i4].getFieldName().equals(cVar2.mo31643e())) {
                                Logger logger2 = f35625a;
                                logger2.warning("Known Field:" + cVar2.mo31643e() + " with invalid field type of:" + e2 + " is ignored");
                                i = 1;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i == 0) {
                            Logger logger3 = f35625a;
                            logger3.warning("UnKnown Field:" + cVar2.mo31643e() + " with invalid field type of:" + e2 + " created as binary");
                            cVar.mo31522f(new C9281d(cVar2.mo31643e(), byteBuffer));
                        }
                    }
                } else if (cVar2.mo31643e().equals(C9270b.AAPR.getFieldName())) {
                    cVar.mo31522f(new C9284g(cVar2, byteBuffer));
                } else {
                    cVar.mo31522f(new C9284g(cVar2, byteBuffer));
                }
            }
        }
    }

    /* renamed from: b */
    public C9271c mo31629b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        C9077c cVar;
        C9271c cVar2 = new C9271c();
        C9077c g = C9077c.m48448g(randomAccessFile, C9067b.MOOV.getFieldName());
        if (g != null) {
            ByteBuffer allocate = ByteBuffer.allocate(g.mo31644f() - 8);
            randomAccessFile.getChannel().read(allocate);
            allocate.rewind();
            if (C9077c.m48449h(allocate, C9067b.UDTA.getFieldName()) != null) {
                C9077c h = C9077c.m48449h(allocate, C9067b.META.getFieldName());
                if (h == null) {
                    f35625a.warning(C9118b.MP4_FILE_HAS_NO_METADATA.getMsg());
                    return cVar2;
                }
                new C9087j(h, allocate).mo31665d();
                cVar = C9077c.m48449h(allocate, C9067b.ILST.getFieldName());
                if (cVar == null) {
                    f35625a.warning(C9118b.MP4_FILE_HAS_NO_METADATA.getMsg());
                    return cVar2;
                }
            } else {
                C9077c h2 = C9077c.m48449h(allocate, C9067b.META.getFieldName());
                if (h2 == null) {
                    f35625a.warning(C9118b.MP4_FILE_HAS_NO_METADATA.getMsg());
                    return cVar2;
                }
                new C9087j(h2, allocate).mo31665d();
                cVar = C9077c.m48449h(allocate, C9067b.ILST.getFieldName());
                if (cVar == null) {
                    f35625a.warning(C9118b.MP4_FILE_HAS_NO_METADATA.getMsg());
                    return cVar2;
                }
            }
            int f = cVar.mo31644f() - 8;
            ByteBuffer slice = allocate.slice();
            f35625a.config("headerlengthsays:" + f + "datalength:" + slice.limit());
            f35625a.config("Started to read metadata fields at position is in metadata buffer:" + slice.position());
            for (int i = 0; i < f; i += cVar.mo31644f()) {
                cVar.mo31647k(slice);
                f35625a.config("Next position is at:" + slice.position());
                m48429a(cVar2, cVar, slice.slice());
                slice.position(slice.position() + cVar.mo31639a());
            }
            return cVar2;
        }
        throw new C9015a(C9118b.MP4_FILE_NOT_CONTAINER.getMsg());
    }
}
