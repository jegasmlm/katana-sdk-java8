package com.katana.api.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.katana.api.Response;
import com.katana.api.commands.common.CommandPayload;

/**
 * Created by juan on 26/09/16.
 */
public class ResponseCommandPayload extends CommandPayload<Response> {

    @JsonProperty("c")
    private ResponseCommand command;

    public ResponseCommandPayload() {
    }

    /**
     * @return
     */
    @Override
    public ResponseCommand getCommand() {
        return command;
    }

    /**
     * @param command
     */
    public void setCommand(ResponseCommand command) {
        this.command = command;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseCommandPayload)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        ResponseCommandPayload that = (ResponseCommandPayload) o;

        return getCommand().equals(that.getCommand());

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCommand().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ResponseCommandPayload{" +
                "command=" + command +
                "} " + super.toString();
    }

    public ResponseCommandPayload(ResponseCommandPayload other) {
        super(other);
        this.command = other.command;
    }

    /**
     * Created by juan on 26/09/16.
     */
    public static class ResponseCommand extends Command<Response> {

        @JsonProperty("a")
        private Response argument;

        /**
         * @return
         */
        @Override
        public Response getArgument() {
            return argument;
        }

        /**
         * @param argument
         */
        public void setArgument(Response argument) {
            this.argument = argument;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ResponseCommand)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }

            ResponseCommand that = (ResponseCommand) o;

            return getArgument().equals(that.getArgument());

        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + getArgument().hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "ResponseCommand{" +
                    "argument=" + argument +
                    "} " + super.toString();
        }
    }
}
