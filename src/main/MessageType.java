package main;

public enum MessageType {
	Heartbeat,
	NewMessageForwardedToLeader,
	NewMessageToCache,
	MessageCached,
	WriteMessage,
	Vote,
	RequestVoteForMe,
	AlreadyVoted,
	IAmTheSenat, //New Leader sends to all this that they add them as new leader
	RequestFullMessageHistoryFromAnotherNode,
	RequestActiveClientsListFromAnotherNode,
	NewClientInPhonebookSyncronizeWithAllClients,
	WannaJoin,		//request from joiner to friend
	WhichPort, 	//request from joiner to leader
	HeartbeatResponse,	
	ReadyForRaft,
	MessageWritten,
	ResolveTwoLeaders,
	TakeIdCounter,
	TakeHistory,
}
