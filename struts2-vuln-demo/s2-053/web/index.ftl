<@s.form action="index" method="POST">
    <@s.textarea name="message" label="input some message" />
    <@s.submit value="Submit" />
</@s.form>

<@s.hidden name="${message}"></@s.hidden>