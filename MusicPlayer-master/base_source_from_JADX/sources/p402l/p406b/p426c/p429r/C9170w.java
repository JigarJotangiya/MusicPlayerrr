package p402l.p406b.p426c.p429r;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.w */
/* compiled from: TextEncodedStringSizeTerminated */
public class C9170w extends C9148c {
    public C9170w(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: k */
    private void m48718k(List<String> list, String str) {
        if (!C9134n.m48562h().mo31755z() && str.length() > 0 && str.charAt(str.length() - 1) == 0) {
            list.set(list.size() - 1, list.get(list.size() - 1) + 0);
        }
    }

    /* renamed from: o */
    public static List<String> m48719o(String str) {
        List<String> asList = Arrays.asList(str.split("\\u0000"));
        if (asList.size() != 0) {
            return asList;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(BuildConfig.FLAVOR);
        return arrayList;
    }

    /* renamed from: p */
    private void m48720p() {
        if (C9134n.m48562h().mo31755z()) {
            String str = (String) this.f35771a;
            if (str.length() > 0 && str.charAt(str.length() - 1) == 0) {
                this.f35771a = str.substring(0, str.length() - 1);
            }
        }
    }

    /* renamed from: q */
    private ByteBuffer m48721q(CharsetEncoder charsetEncoder, String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer;
        if (i + 1 == i2) {
            byteBuffer = charsetEncoder.encode(CharBuffer.wrap(str));
        } else {
            byteBuffer = charsetEncoder.encode(CharBuffer.wrap(str + 0));
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    /* renamed from: r */
    private ByteBuffer m48722r(String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer;
        CharsetEncoder newEncoder = Charset.forName("UTF-16BE").newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.IGNORE);
        newEncoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
        if (i + 1 == i2) {
            byteBuffer = newEncoder.encode(CharBuffer.wrap(65279 + str));
        } else {
            byteBuffer = newEncoder.encode(CharBuffer.wrap(65279 + str + 0));
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    /* renamed from: s */
    private ByteBuffer m48723s(String str, int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer;
        CharsetEncoder newEncoder = Charset.forName("UTF-16LE").newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.IGNORE);
        newEncoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
        if (i + 1 == i2) {
            byteBuffer = newEncoder.encode(CharBuffer.wrap(65279 + str));
        } else {
            byteBuffer = newEncoder.encode(CharBuffer.wrap(65279 + str + 0));
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Logger logger = C9146a.f35770e;
        logger.finest("Reading from array from offset:" + i);
        String l = mo31837l();
        CharsetDecoder newDecoder = Charset.forName(l).newDecoder();
        newDecoder.reset();
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        CharBuffer allocate = CharBuffer.allocate(bArr.length - i);
        CoderResult decode = newDecoder.decode(wrap, allocate, true);
        if (decode.isError()) {
            Logger logger2 = C9146a.f35770e;
            logger2.warning("Decoding error:" + decode.toString());
        }
        newDecoder.flush(allocate);
        allocate.flip();
        if (l.equals("UTF-16")) {
            this.f35771a = allocate.toString().replace("﻿", BuildConfig.FLAVOR).replace("￾", BuildConfig.FLAVOR);
        } else {
            this.f35771a = allocate.toString();
        }
        mo31787j(bArr.length - i);
        Logger logger3 = C9146a.f35770e;
        logger3.config("Read SizeTerminatedString:" + this.f35771a + " size:" + this.f35774d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9170w) && super.equals(obj);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        String l = mo31837l();
        try {
            m48720p();
            String str = (String) this.f35771a;
            String str2 = null;
            if (l.equals("UTF-16")) {
                str2 = C9134n.m48562h().mo31743n() ? "UTF-16LE" : "UTF-16BE";
            }
            ByteBuffer allocate = ByteBuffer.allocate((str.length() + 3) * 3);
            List<String> o = m48719o(str);
            m48718k(o, str);
            for (int i = 0; i < o.size(); i++) {
                String str3 = o.get(i);
                if (str2 == null) {
                    CharsetEncoder newEncoder = Charset.forName(l).newEncoder();
                    newEncoder.onMalformedInput(CodingErrorAction.IGNORE);
                    newEncoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
                    allocate.put(m48721q(newEncoder, str3, i, o.size()));
                } else if (str2.equals("UTF-16LE")) {
                    allocate.put(m48723s(str3, i, o.size()));
                } else if (str2.equals("UTF-16BE")) {
                    allocate.put(m48722r(str3, i, o.size()));
                }
            }
            allocate.flip();
            int limit = allocate.limit();
            byte[] bArr = new byte[limit];
            allocate.rewind();
            allocate.get(bArr, 0, allocate.limit());
            mo31787j(limit);
            return bArr;
        } catch (CharacterCodingException e) {
            Logger logger = C9146a.f35770e;
            logger.severe(e.getMessage() + ":" + l + ":" + this.f35771a);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo31837l() {
        byte n = mo31774a().mo31942n();
        String f = C9237h.m49061g().mo31785f(n);
        Logger logger = C9146a.f35770e;
        logger.finest("text encoding:" + n + " charset:" + f);
        return f;
    }

    /* renamed from: m */
    public String mo31838m(int i) {
        return m48719o((String) this.f35771a).get(i);
    }

    /* renamed from: n */
    public String mo31839n() {
        List<String> o = m48719o((String) this.f35771a);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < o.size(); i++) {
            if (i != 0) {
                stringBuffer.append("\u0000");
            }
            stringBuffer.append(o.get(i));
        }
        return stringBuffer.toString();
    }
}
