package org.mao.common.message;

import org.mao.common.model.quotation.TickEntity;

import java.util.List;


public class TickMessage extends AbstractMessage {

    public long sequenceId;

    public List<TickEntity> ticks;

}
