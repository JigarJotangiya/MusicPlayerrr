package p402l.p406b.p407a.p420l.p421g;

/* renamed from: l.b.a.l.g.f */
/* compiled from: VorbisPacketType */
public enum C9107f {
    AUDIO(0),
    IDENTIFICATION_HEADER(1),
    COMMENT_HEADER(3),
    SETUP_HEADER(5);
    
    int type;

    private C9107f(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }
}
