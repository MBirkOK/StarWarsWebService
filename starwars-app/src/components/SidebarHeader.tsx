import styled from '@emotion/styled';
import React from 'react';

interface SidebarHeaderProps extends React.HTMLAttributes<HTMLDivElement> {
    children?: React.ReactNode;
    rtl: boolean;
}

const StyledSidebarHeader = styled.div`
  height: 64px;
  min-height: 64px;
  display: flex;
  align-items: center;
  padding: 0 20px;

  > div {
    width: 100%;
    overflow: hidden;
  }
`;


export const SidebarHeader: React.FC<SidebarHeaderProps> = ({children, rtl, ...rest}) => {
    return (
        <StyledSidebarHeader {...rest}>
            <div>
            </div>
        </StyledSidebarHeader>
    );
};