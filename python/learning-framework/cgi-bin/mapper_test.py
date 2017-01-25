#!/usr/bin/python
# coding: utf-8

from simplemapper import BaseMapper

class TestORClass(BaseMapper):
    rows = (('num', 'int'), ('body', 'text'))


if __name__ == '__main__':
    TestORClass.createtable()
    for i in range(10):
        ins = TestORClass(num=i, body='body' + str(i))
        print ins

    print 'start:'
    # print ins

    ins = TestORClass(id=3)
    print ins

    ins.num = 100
    ins.body = u'body100'
    ins.update()

    for i in TestORClass.select(num_gt=5):
        print i
