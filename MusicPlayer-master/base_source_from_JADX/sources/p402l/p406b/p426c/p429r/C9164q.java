package p402l.p406b.p426c.p429r;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.q */
/* compiled from: StringFixedLength */
public class C9164q extends C9148c {
    public C9164q(String str, C9190g gVar, int i) {
        super(str, gVar);
        if (i >= 0) {
            mo31787j(i);
            return;
        }
        throw new IllegalArgumentException("size is less than zero: " + i);
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Logger logger = C9146a.f35770e;
        logger.config("Reading from array from offset:" + i);
        try {
            CharsetDecoder newDecoder = Charset.forName(mo31835k()).newDecoder();
            Logger logger2 = C9146a.f35770e;
            logger2.finest("Array length is:" + bArr.length + "offset is:" + i + "Size is:" + this.f35774d);
            int length = bArr.length - i;
            int i2 = this.f35774d;
            if (length >= i2) {
                String charBuffer = newDecoder.decode(ByteBuffer.wrap(bArr, i, i2)).toString();
                if (charBuffer != null) {
                    this.f35771a = charBuffer;
                    Logger logger3 = C9146a.f35770e;
                    logger3.config("Read StringFixedLength:" + this.f35771a);
                    return;
                }
                throw new NullPointerException("String is null");
            }
            throw new C9124d("byte array is to small to retrieve string of declared length:" + this.f35774d);
        } catch (CharacterCodingException e) {
            C9146a.f35770e.severe(e.getMessage());
            this.f35771a = BuildConfig.FLAVOR;
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9164q) && this.f35774d == ((C9164q) obj).f35774d && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        ByteBuffer byteBuffer;
        int i = 0;
        if (this.f35771a == null) {
            C9146a.f35770e.warning("Value of StringFixedlength Field is null using default value instead");
            byte[] bArr = new byte[this.f35774d];
            while (i < this.f35774d) {
                bArr[i] = 32;
                i++;
            }
            return bArr;
        }
        try {
            String k = mo31835k();
            if (k.equals("UTF-16")) {
                CharsetEncoder newEncoder = Charset.forName("UTF-16LE").newEncoder();
                byteBuffer = newEncoder.encode(CharBuffer.wrap(65279 + ((String) this.f35771a)));
            } else {
                byteBuffer = Charset.forName(k).newEncoder().encode(CharBuffer.wrap((String) this.f35771a));
            }
            if (byteBuffer == null) {
                Logger logger = C9146a.f35770e;
                logger.warning("There was a serious problem writing the following StringFixedlength Field:" + this.f35771a + ":" + "using default value instead");
                byte[] bArr2 = new byte[this.f35774d];
                while (i < this.f35774d) {
                    bArr2[i] = 32;
                    i++;
                }
                return bArr2;
            } else if (byteBuffer.limit() == this.f35774d) {
                byte[] bArr3 = new byte[byteBuffer.limit()];
                byteBuffer.get(bArr3, 0, byteBuffer.limit());
                return bArr3;
            } else if (byteBuffer.limit() > this.f35774d) {
                Logger logger2 = C9146a.f35770e;
                logger2.warning("There was a problem writing the following StringFixedlength Field:" + this.f35771a + " when converted to bytes has length of:" + byteBuffer.limit() + " but field was defined with length of:" + this.f35774d + " too long so stripping extra length");
                int i2 = this.f35774d;
                byte[] bArr4 = new byte[i2];
                byteBuffer.get(bArr4, 0, i2);
                return bArr4;
            } else {
                Logger logger3 = C9146a.f35770e;
                logger3.warning("There was a problem writing the following StringFixedlength Field:" + this.f35771a + " when converted to bytes has length of:" + byteBuffer.limit() + " but field was defined with length of:" + this.f35774d + " too short so padding with spaces to make up extra length");
                byte[] bArr5 = new byte[this.f35774d];
                byteBuffer.get(bArr5, 0, byteBuffer.limit());
                for (int limit = byteBuffer.limit(); limit < this.f35774d; limit++) {
                    bArr5[limit] = 32;
                }
                return bArr5;
            }
        } catch (CharacterCodingException e) {
            Logger logger4 = C9146a.f35770e;
            logger4.warning("There was a problem writing the following StringFixedlength Field:" + this.f35771a + ":" + e.getMessage() + "using default value instead");
            byte[] bArr6 = new byte[this.f35774d];
            while (i < this.f35774d) {
                bArr6[i] = 32;
                i++;
            }
            return bArr6;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo31835k() {
        byte n = mo31774a().mo31942n();
        String f = C9237h.m49061g().mo31785f(n);
        Logger logger = C9146a.f35770e;
        logger.finest("text encoding:" + n + " charset:" + f);
        return f;
    }
}
