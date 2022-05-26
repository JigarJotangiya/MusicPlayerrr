package p402l.p406b.p426c.p429r;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;
import p402l.p406b.p426c.p438w.C9289a;
import p402l.p406b.p441d.C9300a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.p */
/* compiled from: PartOfSet */
public class C9162p extends C9148c {
    public C9162p(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Logger logger = C9146a.f35770e;
        logger.finest("Reading from array from offset:" + i);
        CharsetDecoder newDecoder = Charset.forName(mo31825k()).newDecoder();
        ByteBuffer slice = ByteBuffer.wrap(bArr, i, bArr.length - i).slice();
        CharBuffer allocate = CharBuffer.allocate(bArr.length - i);
        newDecoder.reset();
        CoderResult decode = newDecoder.decode(slice, allocate, true);
        if (decode.isError()) {
            Logger logger2 = C9146a.f35770e;
            logger2.warning("Decoding error:" + decode.toString());
        }
        newDecoder.flush(allocate);
        allocate.flip();
        this.f35771a = new C9163a(allocate.toString());
        mo31787j(bArr.length - i);
        Logger logger3 = C9146a.f35770e;
        logger3.config("Read SizeTerminatedString:" + this.f35771a + " size:" + this.f35774d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9162p)) {
            return false;
        }
        return C9300a.m49299b(this.f35771a, ((C9162p) obj).f35771a);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        byte[] bArr;
        String aVar = mo31777d().toString();
        try {
            if (C9134n.m48562h().mo31755z() && aVar.length() > 0 && aVar.charAt(aVar.length() - 1) == 0) {
                aVar = aVar.substring(0, aVar.length() - 1);
            }
            String k = mo31825k();
            if (k.equals("UTF-16")) {
                CharsetEncoder newEncoder = Charset.forName("UTF-16LE").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.IGNORE);
                newEncoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
                ByteBuffer encode = newEncoder.encode(CharBuffer.wrap(65279 + aVar));
                bArr = new byte[encode.limit()];
                encode.get(bArr, 0, encode.limit());
            } else {
                CharsetEncoder newEncoder2 = Charset.forName(k).newEncoder();
                ByteBuffer encode2 = newEncoder2.encode(CharBuffer.wrap(aVar));
                newEncoder2.onMalformedInput(CodingErrorAction.IGNORE);
                newEncoder2.onUnmappableCharacter(CodingErrorAction.IGNORE);
                bArr = new byte[encode2.limit()];
                encode2.get(bArr, 0, encode2.limit());
            }
            mo31787j(bArr.length);
            return bArr;
        } catch (CharacterCodingException e) {
            C9146a.f35770e.severe(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo31825k() {
        byte n = mo31774a().mo31942n();
        String f = C9237h.m49061g().mo31785f(n);
        Logger logger = C9146a.f35770e;
        logger.finest("text encoding:" + n + " charset:" + f);
        return f;
    }

    /* renamed from: l */
    public C9163a mo31777d() {
        return (C9163a) this.f35771a;
    }

    public String toString() {
        return this.f35771a.toString();
    }

    /* renamed from: l.b.c.r.p$a */
    /* compiled from: PartOfSet */
    public static class C9163a {

        /* renamed from: g */
        private static final Pattern f35794g = Pattern.compile("([0-9]+)/([0-9]+)(.*)", 2);

        /* renamed from: h */
        private static final Pattern f35795h = Pattern.compile("([0-9]+)(.*)", 2);

        /* renamed from: a */
        private Integer f35796a;

        /* renamed from: b */
        private Integer f35797b;

        /* renamed from: c */
        private String f35798c;

        /* renamed from: d */
        private String f35799d;

        /* renamed from: e */
        private String f35800e;

        /* renamed from: f */
        private String f35801f;

        public C9163a() {
            this.f35799d = BuildConfig.FLAVOR;
        }

        /* renamed from: e */
        private void m48693e(String str) {
            try {
                Matcher matcher = f35794g.matcher(str);
                if (matcher.matches()) {
                    this.f35798c = matcher.group(3);
                    this.f35796a = Integer.valueOf(Integer.parseInt(matcher.group(1)));
                    this.f35800e = matcher.group(1);
                    this.f35797b = Integer.valueOf(Integer.parseInt(matcher.group(2)));
                    this.f35801f = matcher.group(2);
                    return;
                }
                Matcher matcher2 = f35795h.matcher(str);
                if (matcher2.matches()) {
                    this.f35798c = matcher2.group(2);
                    this.f35796a = Integer.valueOf(Integer.parseInt(matcher2.group(1)));
                    this.f35800e = matcher2.group(1);
                }
            } catch (NumberFormatException unused) {
                this.f35796a = 0;
            }
        }

        /* renamed from: f */
        private void m48694f(StringBuffer stringBuffer, Integer num, C9289a aVar) {
            if (num == null) {
                return;
            }
            if (aVar == C9289a.PAD_ONE_ZERO) {
                if (num.intValue() <= 0 || num.intValue() >= 10) {
                    stringBuffer.append(num.intValue());
                    return;
                }
                stringBuffer.append("0");
                stringBuffer.append(num);
            } else if (aVar == C9289a.PAD_TWO_ZERO) {
                if (num.intValue() > 0 && num.intValue() < 10) {
                    stringBuffer.append("00");
                    stringBuffer.append(num);
                } else if (num.intValue() <= 9 || num.intValue() >= 100) {
                    stringBuffer.append(num.intValue());
                } else {
                    stringBuffer.append("0");
                    stringBuffer.append(num);
                }
            } else if (aVar != C9289a.PAD_THREE_ZERO) {
            } else {
                if (num.intValue() > 0 && num.intValue() < 10) {
                    stringBuffer.append("000");
                    stringBuffer.append(num);
                } else if (num.intValue() > 9 && num.intValue() < 100) {
                    stringBuffer.append("00");
                    stringBuffer.append(num);
                } else if (num.intValue() <= 99 || num.intValue() >= 1000) {
                    stringBuffer.append(num.intValue());
                } else {
                    stringBuffer.append("0");
                    stringBuffer.append(num);
                }
            }
        }

        /* renamed from: g */
        private void m48695g() {
            StringBuffer stringBuffer = new StringBuffer();
            String str = this.f35800e;
            if (str != null) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append("0");
            }
            if (this.f35801f != null) {
                stringBuffer.append("/" + this.f35801f);
            }
            String str2 = this.f35798c;
            if (str2 != null) {
                stringBuffer.append(str2);
            }
            this.f35799d = stringBuffer.toString();
        }

        /* renamed from: a */
        public Integer mo31827a() {
            return this.f35796a;
        }

        /* renamed from: b */
        public String mo31828b() {
            StringBuffer stringBuffer = new StringBuffer();
            if (!C9134n.m48562h().mo31754y()) {
                return this.f35800e;
            }
            m48694f(stringBuffer, this.f35796a, C9134n.m48562h().mo31741l());
            return stringBuffer.toString();
        }

        /* renamed from: c */
        public Integer mo31829c() {
            return this.f35797b;
        }

        /* renamed from: d */
        public String mo31830d() {
            StringBuffer stringBuffer = new StringBuffer();
            if (!C9134n.m48562h().mo31754y()) {
                return this.f35801f;
            }
            m48694f(stringBuffer, this.f35797b, C9134n.m48562h().mo31741l());
            return stringBuffer.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9163a)) {
                return false;
            }
            C9163a aVar = (C9163a) obj;
            if (!C9300a.m49299b(mo31827a(), aVar.mo31827a()) || !C9300a.m49299b(mo31829c(), aVar.mo31829c())) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public void mo31832h(String str) {
            try {
                this.f35796a = Integer.valueOf(Integer.parseInt(str));
                this.f35800e = str;
                m48695g();
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: i */
        public void mo31833i(String str) {
            try {
                this.f35797b = Integer.valueOf(Integer.parseInt(str));
                this.f35801f = str;
                m48695g();
            } catch (NumberFormatException unused) {
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (!C9134n.m48562h().mo31754y()) {
                return this.f35799d;
            }
            Integer num = this.f35796a;
            if (num != null) {
                m48694f(stringBuffer, num, C9134n.m48562h().mo31741l());
            } else if (this.f35797b != null) {
                m48694f(stringBuffer, 0, C9134n.m48562h().mo31741l());
            }
            if (this.f35797b != null) {
                stringBuffer.append("/");
                m48694f(stringBuffer, this.f35797b, C9134n.m48562h().mo31741l());
            }
            String str = this.f35798c;
            if (str != null) {
                stringBuffer.append(str);
            }
            return stringBuffer.toString();
        }

        public C9163a(String str) {
            this.f35799d = str;
            m48693e(str);
        }
    }
}
