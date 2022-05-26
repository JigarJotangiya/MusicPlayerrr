package coocent.music.player.skin.net;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: coocent.music.player.skin.net.b */
/* compiled from: SkinConfigXmlParser */
public class C7115b {

    /* renamed from: coocent.music.player.skin.net.b$b */
    /* compiled from: SkinConfigXmlParser */
    private class C7117b extends DefaultHandler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ArrayList<MySkinEntity> f31400a;

        /* renamed from: b */
        private MySkinEntity f31401b;

        /* renamed from: c */
        private String f31402c;

        private C7117b(C7115b bVar) {
        }

        public void characters(char[] cArr, int i, int i2) throws SAXException {
            String str = new String(cArr, i, i2);
            if ("skin_name".equals(this.f31402c)) {
                this.f31401b.mo27316l(str);
            } else if ("skin_modify_number".equals(this.f31402c)) {
                this.f31401b.mo27315k(str);
            } else if ("min_app_version".equals(this.f31402c)) {
                this.f31401b.mo27314j(str);
            } else if ("skin_zip_link".equals(this.f31402c)) {
                this.f31401b.mo27318n(str);
            } else if ("skin_thumbnail_link".equals(this.f31402c)) {
                this.f31401b.mo27317m(str);
            } else if ("skin_zip_size".equals(this.f31402c)) {
                this.f31401b.mo27319o(str);
            }
        }

        public void endElement(String str, String str2, String str3) throws SAXException {
            if ("skin".equals(str2)) {
                this.f31400a.add(this.f31401b);
            }
            this.f31402c = null;
        }

        public void startDocument() throws SAXException {
            this.f31400a = new ArrayList<>();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if ("skin".equals(str2)) {
                MySkinEntity mySkinEntity = new MySkinEntity();
                this.f31401b = mySkinEntity;
                mySkinEntity.mo27313i(Integer.parseInt(attributes.getValue("id")));
            }
            this.f31402c = str2;
        }
    }

    public C7115b(Context context) {
    }

    /* renamed from: a */
    public ArrayList<MySkinEntity> mo27331a(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            return null;
        }
        SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
        C7117b bVar = new C7117b();
        newSAXParser.parse(inputStream, bVar);
        return bVar.f31400a;
    }
}
