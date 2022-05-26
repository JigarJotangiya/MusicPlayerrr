package net.coocent.android.xmlparser;

import android.content.Context;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import net.coocent.android.xmlparser.livedatabus.C9464a;
import net.coocent.android.xmlparser.p461z.C9564d;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: net.coocent.android.xmlparser.o */
/* compiled from: GiftXmlParser */
public class C9484o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f36467a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f36468b;

    /* renamed from: net.coocent.android.xmlparser.o$b */
    /* compiled from: GiftXmlParser */
    private class C9486b extends DefaultHandler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ArrayList<C9483n> f36469a;

        /* renamed from: b */
        private C9483n f36470b;

        /* renamed from: c */
        private String f36471c;

        private C9486b() {
        }

        public void characters(char[] cArr, int i, int i2) throws SAXException {
            String str = new String(cArr, i, i2);
            if ("packagename".equals(this.f36471c)) {
                this.f36470b.mo32704p(str);
            } else if ("title".equals(this.f36471c)) {
                this.f36470b.mo32705q(str);
            } else if ("info_key".equals(this.f36471c)) {
                this.f36470b.mo32697i(str);
            } else if ("info".equals(this.f36471c)) {
                this.f36470b.mo32698j(str);
            } else if ("icon_imagePath".equals(this.f36471c)) {
                C9483n nVar = this.f36470b;
                nVar.mo32701m(C9502v.f36497a + str);
            } else if (TextUtils.equals(this.f36471c, "icon_bannerPath")) {
                C9483n nVar2 = this.f36470b;
                nVar2.mo32699k(C9502v.f36497a + str);
            } else if (TextUtils.equals(this.f36471c, "icon_bannerPath2")) {
                C9483n nVar3 = this.f36470b;
                nVar3.mo32700l(C9502v.f36497a + str);
            } else if (TextUtils.equals(this.f36471c, "icon_nobanner")) {
                this.f36470b.mo32702n(str);
            }
        }

        public void endElement(String str, String str2, String str3) throws SAXException {
            if ("gift".equals(str2)) {
                int a = C9484o.this.f36468b;
                if (a != 1) {
                    if (a != 2) {
                        this.f36469a.add(this.f36470b);
                    } else if (!TextUtils.isEmpty(this.f36470b.mo32695g())) {
                        this.f36469a.add(this.f36470b);
                    }
                } else if (!C9564d.m50182h(C9484o.this.f36467a, this.f36470b.mo32695g())) {
                    this.f36469a.add(this.f36470b);
                }
            }
            this.f36471c = null;
        }

        public void startDocument() throws SAXException {
            this.f36469a = new ArrayList<>();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (TextUtils.equals("giftList", str2)) {
                String value = attributes.getValue("id");
                if (!TextUtils.isEmpty(value)) {
                    boolean z = true;
                    if (Integer.parseInt(value) != 1) {
                        z = false;
                    }
                    C9464a.m49831a().mo32604b("coocent_game_visible", Boolean.class).mo32605a(Boolean.valueOf(z));
                }
            }
            if ("gift".equals(str2)) {
                try {
                    this.f36470b = new C9483n();
                    String value2 = attributes.getValue("id");
                    if (!TextUtils.isEmpty(value2)) {
                        this.f36470b.mo32703o(Integer.parseInt(value2));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f36471c = str2;
        }
    }

    public C9484o(Context context, int i) {
        this.f36467a = context.getApplicationContext();
        this.f36468b = i;
    }

    /* renamed from: c */
    public ArrayList<C9483n> mo32706c(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            return null;
        }
        SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
        C9486b bVar = new C9486b();
        newSAXParser.parse(inputStream, bVar);
        return bVar.f36469a;
    }
}
