package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p429r.C9167t;
import p402l.p406b.p426c.p431t.C9192h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.b */
/* compiled from: AbstractFrameBodyUrlLink */
public abstract class C9201b extends C9203c {
    protected C9201b() {
    }

    /* renamed from: x */
    private String m48912x(String str) {
        try {
            String[] split = str.split("(?<!/)/(?!/)", -1);
            StringBuffer stringBuffer = new StringBuffer(split[0]);
            for (int i = 1; i < split.length; i++) {
                stringBuffer.append("/");
                stringBuffer.append(URLEncoder.encode(split[i], "utf-8"));
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            Logger logger = C9192h.f35863g;
            logger.warning("Uable to url encode because utf-8 charset not available:" + e.getMessage());
            return str;
        }
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo31965y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9167t("URLLink", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        CharsetEncoder newEncoder = Charset.forName("ISO-8859-1").newEncoder();
        String y = mo31965y();
        if (!newEncoder.canEncode(y)) {
            mo31966z(m48912x(y));
            if (!newEncoder.canEncode(mo31965y())) {
                C9192h.f35863g.warning(C9118b.MP3_UNABLE_TO_ENCODE_URL.getMsg(y));
                mo31966z(BuildConfig.FLAVOR);
            } else {
                C9192h.f35863g.warning(C9118b.MP3_URL_SAVED_ENCODED.getMsg(y, mo31965y()));
            }
        }
        super.mo31961w(byteArrayOutputStream);
    }

    /* renamed from: y */
    public String mo31965y() {
        return (String) mo31941m("URLLink");
    }

    /* renamed from: z */
    public void mo31966z(String str) {
        if (str != null) {
            mo31946r("URLLink", str);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }
}
