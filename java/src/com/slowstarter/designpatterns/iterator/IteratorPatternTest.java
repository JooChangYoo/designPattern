package com.slowstarter.designpatterns.iterator;

/**
 * @reference http://www.journaldev.com/1716/iterator-design-pattern-in-java-example-tutorial
 */
public class IteratorPatternTest {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator koreanIterator = channels.iterator(ChannelTypeEnum.KOREAN);
        while (koreanIterator.hasNext()) {
            Channel c = koreanIterator.next();
            System.out.println(c.toString());
        }
    }
 
    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.KOREAN));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.KOREAN));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ALL));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.KOREAN));
        return channels;
    }
}
