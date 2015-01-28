package com.dyz.gameserver.net;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dyz.gameserver.bootstrap.GameServer;
import com.dyz.gameserver.commons.message.ClientRequest;
import com.dyz.gameserver.commons.session.GameSession;

public class MinaMsgHandler extends IoHandlerAdapter{
	
	private static final Logger logger = LoggerFactory.getLogger(MinaMsgHandler.class);
	
	@Override
	public void sessionCreated(IoSession session) throws Exception {
		new GameSession(session);
	}
	
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		ClientRequest clientRequest = (ClientRequest) message;
		GameSession gameSession = GameSession.getInstance(session);
		if (gameSession == null) {
			return;
		}
		
		GameServer.msgDispatcher.dispatchMsg(gameSession,clientRequest);
	}
	
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		logger.error(cause.getMessage());
	}
	
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		logger.info("a session closed");
	}
}
