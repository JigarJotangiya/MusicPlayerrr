package p402l.p406b.p407a.p418k;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9016b;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p407a.p418k.p419j.C9076b;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p407a.p418k.p419j.C9078d;
import p402l.p406b.p407a.p418k.p419j.C9079e;
import p402l.p406b.p407a.p418k.p419j.C9083g;
import p402l.p406b.p407a.p418k.p419j.C9086i;
import p402l.p406b.p407a.p418k.p419j.C9088k;
import p402l.p406b.p407a.p418k.p419j.C9089l;
import p402l.p406b.p407a.p418k.p419j.C9091n;
import p402l.p406b.p425b.C9118b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.k.g */
/* compiled from: Mp4InfoReader */
public class C9072g {

    /* renamed from: a */
    public static Logger f35624a = Logger.getLogger("org.jaudiotagger.audio.mp4.atom");

    /* renamed from: a */
    private boolean m48427a(C9083g gVar, C9077c cVar, ByteBuffer byteBuffer) throws IOException {
        C9077c h;
        if (C9077c.m48449h(byteBuffer, C9067b.MDIA.getFieldName()) == null || (h = C9077c.m48449h(byteBuffer, C9067b.MDHD.getFieldName())) == null) {
            return false;
        }
        byteBuffer.position(byteBuffer.position() + h.mo31639a());
        if (C9077c.m48449h(byteBuffer, C9067b.MINF.getFieldName()) == null || C9077c.m48449h(byteBuffer, C9067b.VMHD.getFieldName()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C9053f mo31628b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        C9077c h;
        C9069d dVar = new C9069d();
        C9077c g = C9077c.m48448g(randomAccessFile, C9067b.FTYP.getFieldName());
        if (g != null) {
            ByteBuffer allocate = ByteBuffer.allocate(g.mo31644f() - 8);
            randomAccessFile.getChannel().read(allocate);
            allocate.rewind();
            C9083g gVar = new C9083g(g, allocate);
            gVar.mo31659d();
            dVar.mo31625q(gVar.mo31658c());
            C9077c g2 = C9077c.m48448g(randomAccessFile, C9067b.MOOV.getFieldName());
            if (g2 != null) {
                ByteBuffer allocate2 = ByteBuffer.allocate(g2.mo31644f() - 8);
                randomAccessFile.getChannel().read(allocate2);
                allocate2.rewind();
                C9077c h2 = C9077c.m48449h(allocate2, C9067b.MVHD.getFieldName());
                if (h2 != null) {
                    ByteBuffer slice = allocate2.slice();
                    dVar.mo31553l(new C9089l(h2, slice).mo31667c());
                    slice.position(slice.position() + h2.mo31639a());
                    C9077c h3 = C9077c.m48449h(slice, C9067b.TRAK.getFieldName());
                    int position = slice.position() + h3.mo31639a();
                    if (h3 == null) {
                        throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                    } else if (C9077c.m48449h(slice, C9067b.MDIA.getFieldName()) != null) {
                        C9077c h4 = C9077c.m48449h(slice, C9067b.MDHD.getFieldName());
                        if (h4 != null) {
                            dVar.mo31556o(new C9086i(h4, slice.slice()).mo31664c());
                            slice.position(slice.position() + h4.mo31639a());
                            if (C9077c.m48449h(slice, C9067b.MINF.getFieldName()) != null) {
                                int position2 = slice.position();
                                C9077c h5 = C9077c.m48449h(slice, C9067b.SMHD.getFieldName());
                                if (h5 == null) {
                                    slice.position(position2);
                                    if (C9077c.m48449h(slice, C9067b.VMHD.getFieldName()) != null) {
                                        throw new C9016b(C9118b.MP4_FILE_IS_VIDEO.getMsg());
                                    }
                                    throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                                }
                                slice.position(slice.position() + h5.mo31639a());
                                if (C9077c.m48449h(slice, C9067b.STBL.getFieldName()) != null) {
                                    C9077c h6 = C9077c.m48449h(slice, C9067b.STSD.getFieldName());
                                    if (h6 != null) {
                                        new C9091n(h6, slice).mo31670c();
                                        int position3 = slice.position();
                                        C9077c h7 = C9077c.m48449h(slice, C9067b.MP4A.getFieldName());
                                        if (h7 != null) {
                                            ByteBuffer slice2 = slice.slice();
                                            new C9088k(h7, slice2).mo31666c();
                                            C9077c h8 = C9077c.m48449h(slice2, C9067b.ESDS.getFieldName());
                                            if (h8 != null) {
                                                C9079e eVar = new C9079e(h8, slice2.slice());
                                                dVar.mo31548g(eVar.mo31651d() / 1000);
                                                dVar.mo31550i(eVar.mo31653f());
                                                dVar.mo31626r(eVar.mo31652e());
                                                dVar.mo31627s(eVar.mo31650c());
                                                dVar.mo31551j(C9066a.AAC.getDescription());
                                            }
                                        } else {
                                            slice.position(position3);
                                            C9077c h9 = C9077c.m48449h(slice, C9067b.DRMS.getFieldName());
                                            if (h9 != null) {
                                                new C9078d(h9, slice).mo31649c();
                                                C9077c h10 = C9077c.m48449h(slice, C9067b.ESDS.getFieldName());
                                                if (h10 != null) {
                                                    C9079e eVar2 = new C9079e(h10, slice.slice());
                                                    dVar.mo31548g(eVar2.mo31651d() / 1000);
                                                    dVar.mo31550i(eVar2.mo31653f());
                                                    dVar.mo31626r(eVar2.mo31652e());
                                                    dVar.mo31627s(eVar2.mo31650c());
                                                    dVar.mo31551j(C9066a.DRM_AAC.getDescription());
                                                }
                                            } else {
                                                slice.position(position3);
                                                C9067b bVar = C9067b.ALAC;
                                                C9077c h11 = C9077c.m48449h(slice, bVar.getFieldName());
                                                if (h11 != null) {
                                                    new C9076b(h11, slice).mo31637f();
                                                    C9077c h12 = C9077c.m48449h(slice, bVar.getFieldName());
                                                    if (h12 != null) {
                                                        C9076b bVar2 = new C9076b(h12, slice);
                                                        bVar2.mo31637f();
                                                        dVar.mo31551j(C9066a.APPLE_LOSSLESS.getDescription());
                                                        dVar.mo31550i(bVar2.mo31635d());
                                                        dVar.mo31548g(bVar2.mo31634c() / 1000);
                                                        dVar.mo31549h(bVar2.mo31636e());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (dVar.mo31544c() == -1) {
                                        dVar.mo31550i(2);
                                    }
                                    if (dVar.mo31542a() == -1) {
                                        dVar.mo31548g(128);
                                    }
                                    if (dVar.mo31543b() == -1) {
                                        dVar.mo31549h(16);
                                    }
                                    if (dVar.mo31545d().equals(BuildConfig.FLAVOR)) {
                                        dVar.mo31551j(C9066a.AAC.getDescription());
                                    }
                                    f35624a.config(dVar.toString());
                                    slice.position(position);
                                    while (slice.hasRemaining() && (h = C9077c.m48449h(slice, C9067b.TRAK.getFieldName())) != null) {
                                        if (m48427a(gVar, h, slice)) {
                                            throw new C9016b(C9118b.MP4_FILE_IS_VIDEO.getMsg());
                                        }
                                    }
                                    new C9068c(randomAccessFile, false);
                                    return dVar;
                                }
                                throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                            }
                            throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                        }
                        throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                    } else {
                        throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                    }
                } else {
                    throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
                }
            } else {
                throw new C9015a(C9118b.MP4_FILE_NOT_AUDIO.getMsg());
            }
        } else {
            throw new C9015a(C9118b.MP4_FILE_NOT_CONTAINER.getMsg());
        }
    }
}
