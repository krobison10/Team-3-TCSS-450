package edu.uw.tcss450.kylerr10.chatapp.ui.chat;



import java.util.List;
import edu.uw.tcss450.kylerr10.chatapp.ui.chat.chat_members.ChatMember;

/**
 * Represents a chat room with a name and last message
 * @author Leyla Ahmed
 */

public class ChatRoom {

    //The name of the chat room
    private String mName;

    //The last message sent in the chat room
    private String mLastMessage;

    //The next available ID for the chat room
    private static int mNextId = 1;

    //The ID of the chat room
    private int mChatId;

    //The list of chat members in the chat room
    private List<ChatMember> mMembers;

    //The list of selected chat members
    private List<ChatMember> mSelectedMembers;

    //The adapter used for managing chat room members
    private ChatRoomMemberAdapter mMemberAdapter;


    /**
     * Constructs a new ChatRoom object with the given chat ID and name.
     * @param chatId The ID of the chat room
     * @param name   The name of the chat room
     */
    public ChatRoom(int chatId, String name, String mLastMessage) {
        this.mChatId = mNextId++;
        this.mName = name;
        this.mLastMessage = mLastMessage;

    }


    /**
     * Constructs a new ChatRoom object with the given name and last message.
     * @param name the name of the chat room
     * @param lastMessage the last message in chat
     */
    public ChatRoom(String name, String lastMessage) {
        this.mName = name;
        this.mLastMessage = mLastMessage;
    }


    /**
     * Constructs a new ChatRoom object with the given name and member IDs.
     * @param name     The name of the chat room
     * @param members The list of member IDs in the chat room
     */
    public ChatRoom(String name, List<ChatMember> members){
        this.mName = name;
        this.mMembers = members;
    }


    /**
     * Returns the chat ID of the chat room.
     * @return The chat ID.
     */
    public int getId() {
        return mChatId;
    }


    /**
     * Returns the name of the chat room.
     * @return the name of the chat room
     */
    public String getRoomName() {
        return mName;
    }


    /**
     * Returns the last message sent in the chat room.
     * @return the last message sent in the chat room
     */
    public String getLastMessage() {
        return mLastMessage;
    }


    /**
     * Sets the name of the chat room.
     * @param name the new name of the chat room
     */

    public void setRoomName(String name) {
        this.mName = name;
    }


    /**
     * Sets the last message sent in the chat room.
     * @param lastMessage the last message sent in the chat room
     */
    public void setLastMessage(String lastMessage) {
        this.mLastMessage = lastMessage;
    }


    /**
     * Sets the list of selected members for the chat room.
     * @param selectedMembers The list of selected chat members
     */
    public void setSelectedMembers(List<ChatMember> selectedMembers) {
        this.mSelectedMembers = selectedMembers;
    }


    /**
     * Retrieves the list of selected chat members.
     * @return The list of selected chat members
     */
    public List<ChatMember> getSelectedMembers() {
        return mSelectedMembers;
    }


    /**
     * Returns the adapter for the chat room's member list.
     * @return The ChatRoomMemberAdapter
     */
    public ChatRoomMemberAdapter getMemberAdapter() {
        return mMemberAdapter;
    }

}
