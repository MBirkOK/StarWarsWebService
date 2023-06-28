interface Props {
    text: string
}

export const Label = (props: Props) => {
    return (
        <label>
            {props.text}
        </label>)
}