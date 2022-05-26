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
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.v */
/* compiled from: TextEncodedStringNullTerminated */
public class C9169v extends C9148c {
    public C9169v(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        int i2;
        int position;
        if (i < bArr.length) {
            C9146a.f35770e.finer("Reading from array starting from offset:" + i);
            String k = mo31836k();
            CharsetDecoder newDecoder = Charset.forName(k).newDecoder();
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
            boolean z = false;
            boolean z2 = k.equals("ISO-8859-1") || k.equals("UTF-8");
            while (wrap.hasRemaining()) {
                if (wrap.get() == 0) {
                    if (z2) {
                        wrap.mark();
                        wrap.reset();
                        position = wrap.position() - 1;
                        C9146a.f35770e.finest("Null terminator found starting at:" + position);
                    } else if (!wrap.hasRemaining()) {
                        wrap.mark();
                        wrap.reset();
                        position = wrap.position() - 1;
                        C9146a.f35770e.warning("UTF16:Should be two null terminator marks but only found one starting at:" + position);
                    } else if (wrap.get() == 0) {
                        wrap.mark();
                        wrap.reset();
                        position = wrap.position() - 2;
                        C9146a.f35770e.finest("UTF16:Null terminator found starting  at:" + position);
                    }
                    i2 = position;
                    z = true;
                    break;
                } else if (!z2 && wrap.hasRemaining()) {
                    wrap.get();
                }
            }
            i2 = 0;
            if (z) {
                C9146a.f35770e.finest("End Position is:" + i2 + "Offset:" + i);
                int i3 = i2 - i;
                int i4 = i3 + 1;
                if (!z2) {
                    i4++;
                }
                mo31787j(i4);
                C9146a.f35770e.finest("Text size is:" + i3);
                if (i3 == 0) {
                    this.f35771a = BuildConfig.FLAVOR;
                } else {
                    ByteBuffer slice = ByteBuffer.wrap(bArr, i, i3).slice();
                    CharBuffer allocate = CharBuffer.allocate(i3);
                    newDecoder.reset();
                    CoderResult decode = newDecoder.decode(slice, allocate, true);
                    if (decode.isError()) {
                        C9146a.f35770e.warning("Problem decoding text encoded null terminated string:" + decode.toString());
                    }
                    newDecoder.flush(allocate);
                    allocate.flip();
                    this.f35771a = allocate.toString();
                }
                C9146a.f35770e.config("Read NullTerminatedString:" + this.f35771a + " size inc terminator:" + i4);
                return;
            }
            throw new C9124d("Unable to find null terminated string");
        }
        throw new C9124d("Unable to find null terminated string");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9169v) && super.equals(obj);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        byte[] bArr;
        Logger logger = C9146a.f35770e;
        logger.config("Writing NullTerminatedString." + this.f35771a);
        String k = mo31836k();
        try {
            if (!k.equals("UTF-16")) {
                CharsetEncoder newEncoder = Charset.forName(k).newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.IGNORE);
                newEncoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
                ByteBuffer encode = newEncoder.encode(CharBuffer.wrap(((String) this.f35771a) + 0));
                bArr = new byte[encode.limit()];
                encode.get(bArr, 0, encode.limit());
            } else if (C9134n.m48562h().mo31743n()) {
                CharsetEncoder newEncoder2 = Charset.forName("UTF-16LE").newEncoder();
                newEncoder2.onMalformedInput(CodingErrorAction.IGNORE);
                newEncoder2.onUnmappableCharacter(CodingErrorAction.IGNORE);
                ByteBuffer encode2 = newEncoder2.encode(CharBuffer.wrap(65279 + ((String) this.f35771a) + 0));
                bArr = new byte[encode2.limit()];
                encode2.get(bArr, 0, encode2.limit());
            } else {
                CharsetEncoder newEncoder3 = Charset.forName("UTF-16BE").newEncoder();
                newEncoder3.onMalformedInput(CodingErrorAction.IGNORE);
                newEncoder3.onUnmappableCharacter(CodingErrorAction.IGNORE);
                ByteBuffer encode3 = newEncoder3.encode(CharBuffer.wrap(65279 + ((String) this.f35771a) + 0));
                bArr = new byte[encode3.limit()];
                encode3.get(bArr, 0, encode3.limit());
            }
            mo31787j(bArr.length);
            return bArr;
        } catch (CharacterCodingException e) {
            Logger logger2 = C9146a.f35770e;
            logger2.severe(e.getMessage() + ":" + k + ":" + this.f35771a);
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo31836k() {
        byte n = mo31774a().mo31942n();
        String f = C9237h.m49061g().mo31785f(n);
        Logger logger = C9146a.f35770e;
        logger.finest("text encoding:" + n + " charset:" + f);
        return f;
    }

    public C9169v(String str, C9190g gVar, String str2) {
        super(str, gVar, str2);
    }
}
