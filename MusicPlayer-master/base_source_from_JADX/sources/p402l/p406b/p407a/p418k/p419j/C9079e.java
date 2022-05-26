package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.e */
/* compiled from: Mp4EsdsBox */
public class C9079e extends C9075a {

    /* renamed from: g */
    private static Map<Integer, C9081b> f35646g = new HashMap();

    /* renamed from: h */
    private static Map<Integer, C9080a> f35647h = new HashMap();

    /* renamed from: c */
    private C9081b f35648c;

    /* renamed from: d */
    private C9080a f35649d;

    /* renamed from: e */
    private int f35650e;

    /* renamed from: f */
    private int f35651f;

    /* renamed from: l.b.a.k.j.e$a */
    /* compiled from: Mp4EsdsBox */
    public enum C9080a {
        MAIN(1, "Main"),
        LOW_COMPLEXITY(2, "Low Complexity"),
        SCALEABLE(3, "Scaleable Sample rate"),
        T_F(4, "T/F"),
        T_F_MAIN(5, "T/F Main"),
        T_F_LC(6, "T/F LC"),
        TWIN_VQ(7, "TWIN"),
        CELP(8, "CELP"),
        HVXC(9, "HVXC"),
        HILN(10, "HILN"),
        TTSI(11, "TTSI"),
        MAIN_SYNTHESIS(12, "MAIN_SYNTHESIS"),
        WAVETABLE(13, "WAVETABLE");
        
        private String description;

        /* renamed from: id */
        private int f35653id;

        private C9080a(int i, String str) {
            this.f35653id = i;
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }

        public int getId() {
            return this.f35653id;
        }
    }

    /* renamed from: l.b.a.k.j.e$b */
    /* compiled from: Mp4EsdsBox */
    public enum C9081b {
        V1(1),
        V2(2),
        MPEG4_VIDEO(32),
        MPEG4_AVC_SPS(33),
        MPEG4_AVC_PPS(34),
        MPEG4_AUDIO(64),
        MPEG2_SIMPLE_VIDEO(96),
        MPEG2_MAIN_VIDEO(97),
        MPEG2_SNR_VIDEO(98),
        MPEG2_SPATIAL_VIDEO(99),
        MPEG2_HIGH_VIDEO(100),
        MPEG2_422_VIDEO(101),
        MPEG4_ADTS_MAIN(102),
        MPEG4_ADTS_LOW_COMPLEXITY(103),
        MPEG4_ADTS_SCALEABLE_SAMPLING(104),
        MPEG2_ADTS_MAIN(105),
        MPEG1_VIDEO(106),
        MPEG1_ADTS(107),
        JPEG_VIDEO(108),
        PRIVATE_AUDIO(192),
        PRIVATE_VIDEO(208),
        PCM_LITTLE_ENDIAN_AUDIO(224),
        VORBIS_AUDIO(225),
        DOLBY_V3_AUDIO(226),
        ALAW_AUDIO(227),
        MULAW_AUDIO(228),
        ADPCM_AUDIO(229),
        PCM_BIG_ENDIAN_AUDIO(230),
        YV12_VIDEO(240),
        H264_VIDEO(241),
        H263_VIDEO(242),
        H261_VIDEO(243);
        

        /* renamed from: id */
        private int f35657id;

        private C9081b(int i) {
            this.f35657id = i;
        }

        public int getId() {
            return this.f35657id;
        }
    }

    static {
        for (C9081b bVar : C9081b.values()) {
            f35646g.put(Integer.valueOf(bVar.getId()), bVar);
        }
        for (C9080a aVar : C9080a.values()) {
            f35647h.put(Integer.valueOf(aVar.getId()), aVar);
        }
    }

    public C9079e(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        byteBuffer.position(byteBuffer.position() + 1 + 3);
        if (byteBuffer.get() == 3) {
            mo31654g(byteBuffer);
            byteBuffer.position(byteBuffer.position() + 2 + 1);
        }
        if (byteBuffer.get() == 4) {
            mo31654g(byteBuffer);
            this.f35648c = f35646g.get(Integer.valueOf(byteBuffer.get()));
            byteBuffer.position(byteBuffer.position() + 1 + 3);
            C9057i.m48302e(byteBuffer, byteBuffer.position(), (byteBuffer.position() + 4) - 1);
            byteBuffer.position(byteBuffer.position() + 4);
            this.f35651f = C9057i.m48302e(byteBuffer, byteBuffer.position(), (byteBuffer.position() + 4) - 1);
            byteBuffer.position(byteBuffer.position() + 4);
        }
        if (byteBuffer.get() == 5) {
            mo31654g(byteBuffer);
            this.f35649d = f35647h.get(Integer.valueOf(byteBuffer.get() >> 3));
            this.f35650e = (byteBuffer.get() << 1) >> 4;
        }
    }

    /* renamed from: c */
    public C9080a mo31650c() {
        return this.f35649d;
    }

    /* renamed from: d */
    public int mo31651d() {
        return this.f35651f;
    }

    /* renamed from: e */
    public C9081b mo31652e() {
        return this.f35648c;
    }

    /* renamed from: f */
    public int mo31653f() {
        return this.f35650e;
    }

    /* renamed from: g */
    public int mo31654g(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        byte b2 = b & 255;
        if (b2 != 128 && b2 != 129 && b2 != 254) {
            return b;
        }
        byteBuffer.get();
        byteBuffer.get();
        return byteBuffer.get();
    }
}
