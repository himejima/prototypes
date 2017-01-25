#!/usr/bin/python
# coding: utf-8

from xml.etree.ElementTree import ElementTree
from urllib import urlopen

#rss = ElementTree(file=urlopen('http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topsongs/sf=143462/limit=10/xml'))
rss = ElementTree(file=urlopen('https://www.ruby-lang.org/en/feeds/news.rss'))
root = rss.getroot()
rsslist = []

#print root.iter()
#for item in [ x for x in root.getiterator() if "item" in x.tag]:
for item in [ x for x in root.getiterator() if "item" in x.tag]:
    rssdict = {}
    #for elem in item.getiterator():
    for elem in item.iter():
        for k in ['link', 'title', 'description', 'author', 'pubDate']:
            if k in elem.tag:
                rssdict[k] = elem.text
            else:
                rssdict[k] = rssdict.get(k, "N/A")

    rsslist.append(rssdict)
print rsslist
