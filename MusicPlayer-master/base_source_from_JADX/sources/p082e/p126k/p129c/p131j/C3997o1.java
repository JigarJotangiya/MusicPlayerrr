package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.o1 */
/* compiled from: TextFormatEscaper */
final class C3997o1 {

    /* renamed from: e.k.c.j.o1$a */
    /* compiled from: TextFormatEscaper */
    static class C3998a implements C3999b {

        /* renamed from: a */
        final /* synthetic */ C3934i f12147a;

        C3998a(C3934i iVar) {
            this.f12147a = iVar;
        }

        /* renamed from: a */
        public byte mo13905a(int i) {
            return this.f12147a.byteAt(i);
        }

        public int size() {
            return this.f12147a.size();
        }
    }

    /* renamed from: e.k.c.j.o1$b */
    /* compiled from: TextFormatEscaper */
    private interface C3999b {
        /* renamed from: a */
        byte mo13905a(int i);

        int size();
    }

    /* renamed from: a */
    static String m17470a(C3934i iVar) {
        return m17471b(new C3998a(iVar));
    }

    /* renamed from: b */
    static String m17471b(C3999b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo13905a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    static String m17472c(String str) {
        return m17470a(C3934i.copyFromUtf8(str));
    }
}
