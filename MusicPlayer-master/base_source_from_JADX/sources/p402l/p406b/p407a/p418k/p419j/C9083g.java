package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.g */
/* compiled from: Mp4FtypBox */
public class C9083g extends C9075a {

    /* renamed from: c */
    private String f35658c;

    /* renamed from: d */
    private int f35659d;

    /* renamed from: e */
    private List<String> f35660e = new ArrayList();

    public C9083g(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        this.f35629b = byteBuffer;
    }

    /* renamed from: c */
    public String mo31658c() {
        return this.f35658c;
    }

    /* renamed from: d */
    public void mo31659d() throws C9015a {
        CharsetDecoder newDecoder = Charset.forName("ISO-8859-1").newDecoder();
        try {
            this.f35658c = newDecoder.decode((ByteBuffer) this.f35629b.slice().limit(4)).toString();
        } catch (CharacterCodingException unused) {
        }
        ByteBuffer byteBuffer = this.f35629b;
        byteBuffer.position(byteBuffer.position() + 4);
        ByteBuffer byteBuffer2 = this.f35629b;
        this.f35659d = C9057i.m48302e(byteBuffer2, byteBuffer2.position(), (this.f35629b.position() + 4) - 1);
        ByteBuffer byteBuffer3 = this.f35629b;
        byteBuffer3.position(byteBuffer3.position() + 4);
        while (this.f35629b.position() < this.f35629b.limit() && this.f35629b.limit() - this.f35629b.position() >= 4) {
            newDecoder.onMalformedInput(CodingErrorAction.REPORT);
            newDecoder.onMalformedInput(CodingErrorAction.REPORT);
            try {
                String charBuffer = newDecoder.decode((ByteBuffer) this.f35629b.slice().limit(4)).toString();
                if (!charBuffer.equals("\u0000\u0000\u0000\u0000")) {
                    this.f35660e.add(charBuffer);
                }
            } catch (CharacterCodingException unused2) {
            }
            ByteBuffer byteBuffer4 = this.f35629b;
            byteBuffer4.position(byteBuffer4.position() + 4);
        }
    }

    public String toString() {
        String str = "Major Brand:" + this.f35658c + "Version:" + this.f35659d;
        if (this.f35660e.size() <= 0) {
            return str;
        }
        String str2 = str + "Compatible:";
        for (String str3 : this.f35660e) {
            str2 = (str2 + str3) + ",";
        }
        return str2.substring(0, str2.length() - 1);
    }
}
