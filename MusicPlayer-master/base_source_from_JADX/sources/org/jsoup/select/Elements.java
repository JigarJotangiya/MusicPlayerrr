package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    private Elements siblings(String str, boolean z, boolean z2) {
        Elements elements = new Elements();
        Evaluator parse = str != null ? QueryParser.parse(str) : null;
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            do {
                element = z ? element.nextElementSibling() : element.previousElementSibling();
                if (element == null) {
                    break;
                } else if (parse == null) {
                    elements.add(element);
                    continue;
                } else if (element.mo33204is(parse)) {
                    elements.add(element);
                    continue;
                } else {
                    continue;
                }
            } while (z2);
        }
        return elements;
    }

    public Elements addClass(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).addClass(str);
        }
        return this;
    }

    public Elements after(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).after(str);
        }
        return this;
    }

    public Elements append(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).append(str);
        }
        return this;
    }

    public String attr(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.hasAttr(str)) {
                return element.attr(str);
            }
        }
        return BuildConfig.FLAVOR;
    }

    public Elements before(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).before(str);
        }
        return this;
    }

    public Elements empty() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).empty();
        }
        return this;
    }

    /* renamed from: eq */
    public Elements mo33558eq(int i) {
        if (size() <= i) {
            return new Elements();
        }
        return new Elements((Element) get(i));
    }

    public Element first() {
        if (isEmpty()) {
            return null;
        }
        return (Element) get(0);
    }

    public List<FormElement> forms() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element instanceof FormElement) {
                arrayList.add((FormElement) element);
            }
        }
        return arrayList;
    }

    public boolean hasAttr(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).hasAttr(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).hasClass(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(element.html());
        }
        return sb.toString();
    }

    /* renamed from: is */
    public boolean mo33566is(String str) {
        Evaluator parse = QueryParser.parse(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((Element) it.next()).mo33204is(parse)) {
                return true;
            }
        }
        return false;
    }

    public Element last() {
        if (isEmpty()) {
            return null;
        }
        return (Element) get(size() - 1);
    }

    public Elements next() {
        return siblings((String) null, true, false);
    }

    public Elements nextAll() {
        return siblings((String) null, true, true);
    }

    public Elements not(String str) {
        return Selector.filterOut(this, Selector.select(str, (Iterable<Element>) this));
    }

    public String outerHtml() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(element.outerHtml());
        }
        return sb.toString();
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((Element) it.next()).parents());
        }
        return new Elements((Collection<Element>) linkedHashSet);
    }

    public Elements prepend(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).prepend(str);
        }
        return this;
    }

    public Elements prev() {
        return siblings((String) null, false, false);
    }

    public Elements prevAll() {
        return siblings((String) null, false, true);
    }

    public Elements remove() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).remove();
        }
        return this;
    }

    public Elements removeAttr(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).removeAttr(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).removeClass(str);
        }
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, (Iterable<Element>) this);
    }

    public Elements tagName(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).tagName(str);
        }
        return this;
    }

    public String text() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (sb.length() != 0) {
                sb.append(" ");
            }
            sb.append(element.text());
        }
        return sb.toString();
    }

    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).toggleClass(str);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor nodeTraversor = new NodeTraversor(nodeVisitor);
        Iterator it = iterator();
        while (it.hasNext()) {
            nodeTraversor.traverse((Element) it.next());
        }
        return this;
    }

    public Elements unwrap() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).unwrap();
        }
        return this;
    }

    public String val() {
        return size() > 0 ? first().val() : BuildConfig.FLAVOR;
    }

    public Elements wrap(String str) {
        Validate.notEmpty(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).wrap(str);
        }
        return this;
    }

    public Elements(int i) {
        super(i);
    }

    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            elements.add(((Element) it.next()).clone());
        }
        return elements;
    }

    public Elements next(String str) {
        return siblings(str, true, false);
    }

    public Elements nextAll(String str) {
        return siblings(str, true, true);
    }

    public Elements prev(String str) {
        return siblings(str, false, false);
    }

    public Elements prevAll(String str) {
        return siblings(str, false, true);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements val(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).val(str);
        }
        return this;
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements attr(String str, String str2) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).attr(str, str2);
        }
        return this;
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    public Elements html(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((Element) it.next()).html(str);
        }
        return this;
    }
}
